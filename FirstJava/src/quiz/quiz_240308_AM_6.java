package quiz;

import java.util.Scanner;

public class quiz_240308_AM_6 {

	public static void main(String[] args) {
		// quiz6
		// 정수를 입력받아서 양의 정수인 경우에는 짝수, 홀수를 구분하고, 0이면 0입니다를 출력, 
		// 음수인 경우에는 음의 정수입니다를 출력하는 프로그램을 작성하세요.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수 : ");
		System.out.println("> ");
		int a = scan.nextInt();
		
		if (a == 0) {
			System.out.println("0입니다.");
		}else if (a < 0 ) {
			System.out.println("음의 정수.입니다.");
		}else if (a % 2 == 0) {
			System.out.println("짝입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
		
		/*
		 * if (a == 0){
		 * 	if (a%2 == 0) System.out.println(a +"은 짝수입니다.");
		 * 	else System.out.println(a + "는 홀수입니다");
		 * }else if(a == 0){
		 * 		System.out.println("입력한 정수는 0.);
		 * }else {
		 * 		System.out.println(a + "은 음의 정수입니다.");
		 * }
		 */

	}

}
