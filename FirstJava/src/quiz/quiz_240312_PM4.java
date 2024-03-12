package quiz;

import java.util.Scanner;

public class quiz_240312_PM4 {

	public static void main(String[] args) {
		// 4. 대문자가 입력된다면 소문자로 출력하고, 
		//   소문자가 입력된다면 대문자로 출력하는 프로그램을 작성해보세요
		
		Scanner scan = new Scanner(System.in);
		System.out.println(">> ");
		String str = scan.nextLine();
		
		char[] arr;
		arr = str.toCharArray();
		
		for(int i = 0; i < arr.length; ++i) {
			if(65 <= arr[i] && arr[i] <= 90) {
				arr[i] = (char)(arr[i] + 32);
				continue;
				}
			if (97 <= arr[i] && arr[i] <= 122) {
				arr[i] = (char)(arr[i] - 32);
				continue;
			}
		}
		
		System.out.println(arr);

	}

}
