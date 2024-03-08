package quiz;

import java.util.Scanner;

public class quiz_240308_AM_7 {

	public static void main(String[] args) {
		// quiz7
		// switch를 사용하여 수박, 사과, 멜론, 포도, 귤을 구매시 가격을 출력하는 프로그램을 작성하세요.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("과일 선택 : ");
		System.out.println("[수박, 사과, 멜론, 포도, 귤]");
		System.out.print(">> ");
		String fruit = scan.next();
		
		
		switch(fruit) {
			case "수박.":
				System.out.println(fruit + "의 가격은 4천원.");
				break;
			case "사과.":
				System.out.println(fruit + "의 가격은 2천원.");
				break;
			case "멜론.":
				System.out.println(fruit + "의 가격은 5천원.");
				break;
			case "포도.":
				System.out.println(fruit + "의 가격은 8천원.");
				break;
			case "귤.":
				System.out.println(fruit + "의 가격은 1천원.");
				break;
			default:
				System.out.println(fruit + "의 가격을 알수없음.");
				break;
		}
		
		scan.close();

	}

}
