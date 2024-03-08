package quiz;

import java.util.Scanner;

public class quiz_240308_AM_5 {

	public static void main(String[] args) {
		// quiz5 
		// 정수 두개를 입력받아서 큰수를 출력. 같은 경우에는 같다고 출력하는 프로그램을 작성하세요.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수 두개 입력. : ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		if (a>b) {
			System.out.println("큰수"+ a );
		}else {
			System.out.println("큰수."+ b);
		}
		
		if (a == b) {
			System.out.println("같다.");
			if (a>b) {
				System.out.println("큰수." + a);
			}else {
				System.out.println("큰수.");
			}
		}else {
			System.out.println("다르다.");
		}

	}

}
