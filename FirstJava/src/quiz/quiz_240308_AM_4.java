package quiz;

import java.util.Scanner;

public class quiz_240308_AM_4 {

	public static void main(String[] args) {
		// quiz4 중첩 if
		// 키와 나이를 입력받아서 키는 140이상, 나이는 8살 이상인 경우만 놀이기구에 탑승여부를 결정하는 프로그램을 작성하세요.
		// 조건 : 키 - 140 이상, 나이는 8살 이상
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("키와 나이를 입력하세요.");
		System.out.print("키 : ");
		double height = scanner.nextDouble();
		System.out.print("나이 : ");
		int age = scanner.nextInt();
		
		 
		System.out.println(" 키. : "+ height);  
		System.out.println();
		System.out.println("나이. : "+ age);
		
		if (height >= 140) {
			if (age >= 8) {
				System.out.println("탑승가능.");
			}else {
				System.out.println("탑승불가.");
			}
		}else {
			System.out.println("탑승불가.");
			}
		}
	}


