package customer_final;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class CustomerManager {
	
	static List<Customer> cusList = new ArrayList<>();
	static int count;
	
	static Customer cus = new Customer();
	static Scanner scan = new Scanner(System.in);
	
	public static void insertCustomerData() {
		System.out.print("이름 > ");
		String name = scan.next();
		System.out.print("성별 > ");
		String gender = scan.next();
		System.out.print("이메일 > ");
		String email = scan.next();
		System.out.print("생년월일 > ");
		int birthYear = scan.nextInt();
		
		Customer c1 = new Customer(name, gender, email, birthYear);
		
		cusList.add(c1);
		
//		AddcusMessage addMsg = cus.addCusNo(name, gender, email, birthYear);
//		if(addMsg.type == AddcusMessage.ADD_SUCCESS)
//			cus.save();
//		else if(addMsg.type == AddcusMessage.NOT_EXISTING_GROUP) {
//			System.out.println(addMsg.msg);
//			return;
//		} else if(addMsg.type == AddcusMessage.EXISTING_NUMBER) {
//			
//		}
	}
	
	public static void printAllCustomerData() {
		System.out.println("====== 모든 회원 정보 =======");
		for(int i = 0; i < cusList.size(); i++) {
			Customer customer = cusList.get(i);
			System.out.println(customer.toString());
		}
		System.out.println("==========================");
	}
	
	public static void printCustomerData(Customer cus) {
		System.out.println("==========CUSTOMER INFO============");
		System.out.println("이름 : " + cus.getName());
		System.out.println("성별 : " + cus.getGender());
		System.out.println("이메일 : " + cus.getEmail());
		System.out.println("출생년도 : " + cus.getBirthYear());
		System.out.println("===================================");
	}
	
	public static Customer selectCustomerData() {
		while(true) {
			System.out.println("출력, 수정 또는 삭제할 사람의 이름을 입력하세요.");
			String name = scan.next();
			for(int i = 0; i < count; i++) {
				if(cusList.get(i).getName().equals(name)) {
					return cusList.get(i);
				}
			}
			System.out.println("입력하신 이름을 가진 데이터가 없습니다.");
		}
	}
	
	public static void updateCustomerData(Customer cus) {
		System.out.println("---------------UPDATE CUSTOMER INFO---------------");
		System.out.print("이름" + "(" + cus.getName() + ") :");
		String name = scan.next();
		if (name.length() != 0) {
			cus.setName(name);
		}
		System.out.print("성별(" + cus.getGender() + ") : ");
		cus.setGender(scan.next());
		System.out.print("이메일(" + cus.getEmail() + ") : ");
		cus.setEmail(scan.next());
		System.out.print("출생년도(" + cus.getBirthYear() + ") : ");
		cus.setBirthYear(scan.nextInt());
	}
	
	public static void main(String[] args) {
		
		while(true) {
			
			System.out.println("메뉴를 입력하세요.");
			System.out.println("[ 1. 회원 등록 | 2. 전체 회원 정보 보기 | 3. 회원정보 검색 | 4. 회원정보 수정 | 5. 회원정보 삭제 | 6. 종료 ]");
			System.out.println(">>> ");
			int menu = scan.nextInt();
			
			switch(menu) { // 회원 등록
//				System.out.println("고객 정보 입력을 시작합니다.");
			case 1:
				insertCustomerData();
				break;
			case 2: // 전체 회원 정보 보기
				printAllCustomerData();
				break;
			case 3: // 회원정보 검색 
				printCustomerData(selectCustomerData());
				break;
			case 4: // 회원정보 수정
				System.out.println("데이터를 수정합니다.");
				updateCustomerData(selectCustomerData());
				break;
			case 5:
				// 회원 정보 삭제 기능
				break;
			case 6: // 종료
				scan.close();
				System.out.println("프로그램을 종료합니다.");
				return;
			default :
				System.out.println("올바른 메뉴 번호를 누르시오.");
				break;
			}
		}
	}
}

class Customer123 {
	
	public void printAllCustomer111() {
		
	}
}

class AddcusMessage {
	String msg;
	int type;
	
	final static int NOT_EXISTING_GROUP = 0; // 그룹이 없는것
	final static int EXISTING_NUMBER = 1;    // 번호가 있는것
	final static int ADD_SUCCESS = 2;		 // 추가 성공한것
	
	public AddcusMessage(String msg, int type) {
		this.msg = msg;
		this.type = type;
	}

	@Override
	public String toString() {
		return msg;
	}	
}
