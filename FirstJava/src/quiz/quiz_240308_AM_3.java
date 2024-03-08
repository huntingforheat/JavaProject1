package quiz;

import java.util.Scanner;

public class quiz_240308_AM_3 {

	public static void main(String[] args) {
		// quiz3
		// 정수를 입력받아 그 수가 짝수 인지 홀수인지 출력하는 프로그램을 작성하세요.(삼항연산식 사용)
		
		Scanner scan = new Scanner(System.in);
		
		//int num = ((int)(num)*100)
		
		System.out.print("정수를 입력하시오 :  ");
		int	num3 = scan.nextInt();
		String result = num3%2 == 0 ? "짝수." : "홀수.";
		System.out.println("입력받은" +num3+"는 : "+result);
		
		/*if(line % 2 == 0) {
			System.out.println("짝수입니다.");
		}else {
			System.out.println("홀수입니다.");
		} */

	}

}
