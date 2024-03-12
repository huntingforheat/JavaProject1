package quiz;

import java.util.Scanner;

public class ForStarDiamond2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("줄 수를 입력해주세요 : ");
		int dan = scan.nextInt(); // sp 공백 st 별 flag 반
		
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
					if(j == 0 || j == st -1) {	// 특정상황일떄 별찍
						System.out.print("*");
					}else { 						// 아니면 공백.
						if(j%2 == 0) 			// j의 값이 짝수이면 $ 아니면 공
							System.out.print("$");
						}else {
							System.out.print(" ");
						}
						//System.out.print(" ");
					}
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
