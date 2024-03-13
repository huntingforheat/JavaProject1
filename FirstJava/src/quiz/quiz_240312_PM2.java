package quiz;

import java.util.Scanner;

public class quiz_240312_PM2 {

	public static void main(String[] args) {
		// 2. 단어 거꾸로 출력하기(reverse 출력)
		//   자바의 Scanner 객체를 이용하여 콘솔에 데이터를 입력
		//   입력된 데이터를 for문을 사용하여 거꾸로(reverse) 출력하세요
		//   (String.charAt(index)를 사용)
		
//		Scanner scan = new Scanner(System.in);
//		System.out.print(">> ");
//		String word = scan.next();
//		
//		String reverse ="";
//		for(int i = word.length() - 1; i >= 0; i--) {
//			reverse += word.charAt(i);
//		}
//		System.out.println(reverse);
//		System.out.println(word.length());
		
		System.out.println("========== 입력 값 거꾸로 출력하기 ==========");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine(); // hello
		String reverse = "";
		for(int i = str.length(); i > 0; i--) {
			reverse += str.charAt(i - 1); // 역으로 읽어서 reverse에 대입하기 위해서. str.length()가 5니깐 str.charAt(i-1)을 해주면 4,3,2,1,0 순으로 들어가기 때문에 i-1을 해줌
			System.out.println(str.charAt(i - 1));
		}
		System.out.println();
		System.out.println("거꾸로 문자열 : " + reverse);
		scan.close();
		
	}

}
