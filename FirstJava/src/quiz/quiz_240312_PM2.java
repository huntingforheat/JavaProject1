package quiz;

import java.util.Scanner;

public class quiz_240312_PM2 {

	public static void main(String[] args) {
		// 2. 단어 거꾸로 출력하기(reverse 출력)
		//   자바의 Scanner 객체를 이용하여 콘솔에 데이터를 입력
		//   입력된 데이터를 for문을 사용하여 거꾸로(reverse) 출력하세요
		//   (String.charAt(index)를 사용)
		
		Scanner scan = new Scanner(System.in);
		System.out.print(">> ");
		String word = scan.next();
		
		String reverse ="";
		for(int i = word.length() - 1; i >= 0; i--) {
			reverse += word.charAt(i);
		}
		System.out.println(reverse);
		
	}

}
