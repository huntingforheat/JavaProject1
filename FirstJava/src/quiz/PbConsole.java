package quiz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

import util.Closer;

import java.util.Scanner;
import java.util.Set;

public class PbConsole {
	
	// 폰북을 위한 객체 멤버
	static phoneBook book = new phoneBook();
	static Scanner sc = new Scanner(System.in);
	
	public static void doNewGroup() {
		System.out.print("Enter New Group Name > ");
		book.addGroup(sc.nextLine());
		book.save();
		System.out.println();
	}
	
	public static void doNewAddress() {
		System.out.print("Enter Group Name > ");
		String groupName = sc.nextLine();
		System.out.print("Enter Phone Number > ");
		String number = sc.nextLine();
		System.out.print("Enter Name > ");
		String name = sc.nextLine(); 
		
		AddphMessage addMsg = book.addPhoneNo(groupName, number, name);
		// addMsg를 적절히 처리
		if(addMsg.type == AddphMessage.ADD_SUCCESS)
			book.save();
		else if(addMsg.type == AddphMessage.NOT_EXISTING_GROUP) {
			System.out.println(addMsg.msg);
			return;
		} else if(addMsg.type == AddphMessage.EXISTING_NUMBER) {
			// 수정 여부 선택. 수정해서 다시 등록 vs 등록 안하기
		}
	}
	
	public static void doFindPhone() {
		System.out.println("Enter Phone Number > ");
		String number = sc.nextLine();
		book.searchByNumber(number);
	}
	
	public static void doFindName() {
		System.out.println("Enter Name > ");
		String name = sc.nextLine();
		book.searchByName(name);
	}
	
	public static void main(String[] args) {
	      
	      
	      while (true) {
	         System.out.println("==== What to do ====");         
	         System.out.println("1. New Group");
	         System.out.println("2. Print");
	         System.out.println("3. New Address");
	         System.out.println("4. Find Phone");
	         System.out.println("5. Find Name");
	         System.out.println("6. Exit");
	         System.out.print("> ");
	         int behavior = sc.nextInt();
	         sc.nextLine();
	         
	         switch (behavior) {
	         case 1:
	            doNewGroup();
	            break;
	         case 2:
	            book.printAll();
	            break;
	         case 3:
	            doNewAddress();
	            break;
	         case 4:  
	        	 doFindPhone();
	        	 break;
	         case 5:
	        	 doFindName();
	        	 break;
	         case 6:
	        	 System.out.println("프로그램 종료합니다.");
	        	 System.exit(0);
	         default:
	            break;
	         }
	      }      
	   }
}

class phoneBook {
	
	HashMap<String, HashMap<String, String>> phonebook;
	
	File saveFile = null;
	String savePath = "saveFile/phonebook.sav";  // Documents/Develop
	
	public phoneBook() {
		// 객체 생성시 파일에 저장된 내용을 불러오는 동작
		// 파일이 존재하면, 내용을 불러오고, 파일이 없다면, 디렉터리 및 생성
		
		phonebook = new HashMap<>();
		saveFile = new File(savePath); // File 객체 생성 - 저장 파일에 대한 작업
		if(!saveFile.exists()) {
			File dir = new File(saveFile.getParent());
			dir.mkdir();
		}
		load();		// 객체 실행시 파일의 정보를 불러와서 정보를 완성
	}
	
	public void addGroup(String groupName) {
		if(!phonebook.containsKey(groupName)) { // 있다는 얘기
			phonebook.put(groupName, new HashMap<String, String>());
		}
	}
	
	// 2.
	public void printAll() {
		
		Set<String> groupNames = phonebook.keySet();
		
		for(String groupName : groupNames) {
			System.out.println("******" + groupName + "******");
			
			HashMap<String, String> numberAndNames = phonebook.get(groupName);
			if(numberAndNames.size() == 0) {
				System.out.println("비어 있음");
			} else {
				for (String number : numberAndNames.keySet()) {
					System.out.printf("%s : %s\n", numberAndNames.get(number), number);
				}
			}
		}
	}
	
	// 3.이미 존재하는 그룹에 전화번호를 추가하는 메서드(그룹이 없으면 추가 못함)
	public AddphMessage addPhoneNo(String groupName, String number, String name) {
		if(!phonebook.containsKey(groupName)) {
			return new AddphMessage("없는 그룹입니다.", AddphMessage.NOT_EXISTING_GROUP); 
		} else {
			HashMap<String, String> numberAndNames = phonebook.get(groupName);
			
			if(checkDupleNumber(number)) {
				return new AddphMessage("이미 등록된 번호입니다. 수정하시겠습니까?", AddphMessage.EXISTING_NUMBER);
			}
			
			numberAndNames.put(number, name);
			return new AddphMessage("정상적으로 등록되었습니다.", AddphMessage.ADD_SUCCESS);
		}
	}
	
	// 모든 전화번호를 HashSet으로 반환하는 메서드
	private Set<String> getAllNumber() {
		HashSet<String> allNumbers = new HashSet<String>();
		
		for (HashMap<String, String> group : phonebook.values()) {
			allNumbers.addAll(group.keySet());
		}
		return allNumbers; // 전화번호가 다 들어감
	}
	
	// 전화번호 중복 체크 메서드
	private boolean checkDupleNumber(String number) {
		return getAllNumber().contains(number);  // true가 나오면 중복된 전화번호가 있는것
	}

	// 4. 전화번호의 일부를 입력하면 입력한 부분과 일치하는 모든 사람을 출력하는 메서드
	public void searchByNumber(String number) {
		System.out.println("* * * * *" + number + "* * * * *");
		for(HashMap<String, String> group : phonebook.values()) {  // 해쉬맵 전화번호, 이름
			for(String key : group.keySet()) {
				if(key.contains(number)) {
					System.out.printf("%s : %s\n", group.get(key), key);
				}
			}
		}
	}
	
	// 5. 
	public void searchByName(String inputName) {
		System.out.println("* * * * *" + inputName + "* * * * *");
		for(HashMap<String, String> group : phonebook.values()) {
			for(Entry<String, String> entry : group.entrySet()) { // 엔트리를 사용한 이유는 벨류값과 키값이 떨어지지 않기 위해서 사용
				String number = entry.getKey();
				String name = entry.getValue();
				if(name.contains(inputName)) { // 이름을 봐서
					System.out.printf("%s : %s\n", name, number); // 그 이름에 속해 있는 이름과 번호 출력
				}
			}
		}
	}
	
	// 변경된 내용이 파일에 저장되어 프로그램을 다시 실행할때도 유지되도록 만들어보시오
	public void save() {
		FileWriter out = null;
		
		try {
			out = new FileWriter(saveFile);
			// 전화번호부의 내용을 나름의 문자열로 구성해서 저장
			for(String groupName : phonebook.keySet()) {
				out.write(groupName + ":");
				for(Entry<String, String> e : phonebook.get(groupName).entrySet()) {
					out.write(String.format("%s = %s ", e.getKey(), e.getValue()));
					// groupName : number = name 이런식으로 저장 될 것
				}
				out.write('\n');
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(out != null) Closer.closer(out);
		}
	}
	public void load() {
		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader(saveFile));
			String line = null;
			while((line = in.readLine()) != null) {
				String[] groupAndEntry = line.split(":");
				// 함수는 심플하게 만들어 사용하면 재사용성이 올라갈 수 있음.
				if(groupAndEntry.length == 1) {
					addGroup(groupAndEntry[0]);
				} else {
					addGroup(groupAndEntry[0]);
					String[] entry = groupAndEntry[1].split(" "); // 각 그룹의 전화번호 이름
					
					for(String e : entry) {
						String[] phoneAndName = e.split("=");
						addPhoneNo(groupAndEntry[0], phoneAndName[0], phoneAndName[1]);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(in != null) Closer.closer(in);
		}
	}
}
class AddphMessage { // 전화번호 처리 결과를 나타내는 클래스
	
	String msg;
	int type;
	
	// 상수 처리
	final static int NOT_EXISTING_GROUP = 0; // 그룹이 없는것
	final static int EXISTING_NUMBER = 1;    // 번호가 있는것
	final static int ADD_SUCCESS = 2;		 // 추가 성공한것
	
	public AddphMessage(String msg, int type) {
		this.msg = msg;
		this.type = type;
	}

	@Override
	public String toString() {
		return msg;
	}	
}
