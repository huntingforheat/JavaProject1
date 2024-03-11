package quiz;

public class quiz_star2_240311 {

	public static void main(String[] args) {
		// #1   *       #2 *********
		//	   ***          *******
		//    *****          *****
		//   *******          ***
		//  *********          *

		int dan = 5;
		
//		for(int i = 0; i < dan; i++) {
//			for (int j = dan; j > i; j--) {
//				System.out.print(" ");
//			}
//			for(int k = i * 2 + 1; k > 0; k--) {
//				System.out.print("*");
//			}
//			System.out.println(); 
//		}
		
		for (int i = 0; i < dan; i++) {
			// space 출력
			for(int j = 0; j < dan - i - 1; j++) {
				System.out.print(" ");
			}
			// 별 찍기
			for(int j = 0; j < i * 2 + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int i = 0; i < dan; i++) {
			// space 출력
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * dan - (2 * i) - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}

