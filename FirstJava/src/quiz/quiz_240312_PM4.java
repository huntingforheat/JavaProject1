package quiz;

import java.util.Scanner;

public class quiz_240312_PM4 {

	public static void main(String[] args) {
		// 4. 대문자가 입력된다면 소문자로 출력하고, 
		//   소문자가 입력된다면 대문자로 출력하는 프로그램을 작성해보세요
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println(">> ");
//		String str = scan.nextLine();
//		
//		char[] arr;
//		arr = str.toCharArray();
//		
//		for(int i = 0; i < arr.length; ++i) { // 소문자와 대문자는 32 차이가 남.
//			if(0x41 <= arr[i] && arr[i] <= 0x5A) { // 65 ~ 90
//				arr[i] = (char)(arr[i] + 32);
//				continue;
//				}
//			if (0x61 <= arr[i] && arr[i] <= 0x7A) { // 97 ~ 122
//				arr[i] = (char)(arr[i] - 32);
//				continue;
//			}
//		}
//		
//		System.out.println(arr);

		Scanner scan = new Scanner(System.in);
		System.out.print(">> ");
		char ch = scan.next().charAt(0);
		
		if(ch >= 'A' && ch <= 'Z') {
			ch = (char)(ch - 'A' + 'a');
		}else if(ch >= 'a' && ch <= 'z') {
			ch = (char)(ch - 'a' + 'A');
		}
		System.out.println(ch);
		
		// 문자열을 대문자 문자열 변경. String.toUpperCase()
		// 문자열을 소문자 문자열 변경. String.toLowerCase()
		System.out.println("Hello, world!".toUpperCase());
		System.out.println("Hello, world!".toLowerCase());
	}

}
