package quiz;

public class quiz_star1_240311 {

	public static void main(String[] args) {
		// for문을 이용하여 다음과 같이 별찍기를 진행합니다. 4가지.
		// 1)*     2)***** 3)     * 4) *****
		//	 **      ****        **     ****
		//   ***     ***        ***      ***
		//   ****    **        ****       **
		//   *****   *        *****        *
		
//		for(int i = 1; i <= 5; i++) {
//			for(int j = 0; j < i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		for (int k = 5; k > 0; k--) {
//			for(int l = 0; l < k; l++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		for (int i = 1; i <= 5; i++) {
//			for(int j = 0; j < i; j++) {
//				System.out.print(" ");
//			}
//			for(int j = 5; j > i; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		// #1
		int dan = 5;
		for (int i = 0; i < dan; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// #2
		for (int i = 0; i < dan; i++) {
			for (int j = 0; j < dan - i; j++) {
				// for (int j = dan; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// #3
		for (int i = 0; i < dan; i++) {
			// space를 찍기
			for (int j = 0; j < dan - i - 1; j++) {
				System.out.println(" ");
			}
			// 별찍
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// #4
		for (int i = 0; i < dan; i++) {
			// 여백 찍기
			for (int j = 0; j < i; j++) {
				System.out.println(" ");
			}
			// 별 찍기.
			for (int j = 0; j < dan - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
