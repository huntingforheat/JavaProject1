package quiz;

import java.util.Scanner;

public class ForStarDiamond {

	public static void main(String[] args) {
		// 다이아몬드 찍기
		// 1. 다음과 같은 형태로 별직기를 진행해 보세요.  
		/*          힌트  : 공백, 별, 단(줄)
		      *
		     ***
		    *****
		   *******
		  *********
		   *******
		    *****
		     ***
		      *
		 */

		// 2. 1번의 코드를 활용하여 줄 수를 입력 받아서 그 줄 수 에 맞는 다이아몬드 별을 찍는 
 		//   프로그램을 작성해 보세요. (단, 줄은 홀수로만 입력 받아야 합니다.)

		// int dan  = 9;
		
//		for (int i = 0; i <= 5; i++) {
//			for(int j = 0; j <= 5 - 1; j++) {
//				System.out.print(" ");
//			}
//			for(int j = 0; j < i * 2 + 1; j++) {
//				System.out.print("*");
//			}
//			
//			System.out.println();
//		}
//		for (int i = 4; i > 0; i--) {
//			for(int j = 0; j < i - 1; j++) {
//				System.out.print(" ");
//			}
//			for(int j = 0; j < i; j++) {
//				System.out.print("*");
//			}
//		}
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("줄 수를 입력해주세요 : ");
		int dan = scan.nextInt();
		
//		for(int i = 0; i < dan; i++) { // 삼각형.
//			for(int j = 0; j < dan - i - 1; j++) {
//				System.out.print(" ");
//			}
//			for(int j = 0; j < i * 2 + 1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		for (int i = 0; i < dan - 1; i++) { // 역삼각형.
//			for(int j = 0; j < i + 1; j++) {
//				System.out.print(" ");
//			}
//			for(int j = 0; j < 2 * (dan - i - 1) - 1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		// 코드 최적화
		// 변수 선언 : sp(여백), st(별), 반전을 위한 flag(boolean) - true(삼각형), false(역삼각형) 삼각형 sp - 1, st + 2, 역삼각형 sp + 1, st - 2
		int sp = dan / 2;
		int st = 1;
		boolean flag = true;
		
		for(int i = 0; i < dan; i++) {
			// 여백처리
				for(int j = 0; j < sp; j++) {
					System.out.print(" ");
				}
				// 별찍기
				for(int j = 0; j < st; j++) {
					System.out.print("*");
				}
				System.out.println();
				if(i == (dan / 2)) flag = false; // 반전.
				if(flag) {
					sp -=1; st += 2;
				}else {
					sp += 1; st -= 2;
				}
		}
		
		scan.close();
		
		
	}

}