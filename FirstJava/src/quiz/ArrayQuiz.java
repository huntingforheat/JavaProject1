package quiz;

import java.util.Arrays;

public class ArrayQuiz {

	public static void main(String[] args) {
		// 1. 1000개짜리 int형 배열을 생성한 뒤 모든 값을 1 - 100사이의 
		//    램덤 숫자로 채워보세요
		
		// 2. 1000개의 램덤 숫자들 중 각 숫자가 몇번씩 나왔는지 세어 출력하세요 
	
//		int[] numbers = new int[1000];
//		
//		for(int i = 0; i < numbers.length; i++) {
//			numbers[i] = i + 1;
//		}
//		
//		int array = 0;
//		int j = 0;
//		
//		for(int i = 0; i < 1000; i++) {
//			j = (int)(Math.random()*100);
//			array = numbers[i];
//			numbers[i] = numbers[j];
//			numbers[j] = array;
//		}
//		
//		for (int i = 0; i < 1000; i++) {
//			System.out.printf("numbers[%d]=%d%n", i, numbers[i]);
//		}
//		
//		int[] count = new int[1000];
//		
//		for(int i = 0; i < numbers.length; i++) {
//			count[numbers[i]]++;
//		}
//		for(int i = 0; i < count.length; i++) {
//			System.out.println(count[i] + "번." + i);
//		}
		
		// 1.
		// 배열 선언 및 초기화
		int[] nums = new int[1000];
		for(int i = 0; i < 1000; i++) {
			nums[i] = (int)(Math.random()*100) + 1; // 1-100까지니깐 +1
		}
		System.out.println(Arrays.toString(nums));
		System.out.println(nums.length);
		
		// 2.
		int[] cnt = new int[100];
		
		for(int j = 1; j <= 100; j++) { // 1 - 100 사이에 나온 숫자의 횟차
			for(int i = 0; i < nums.length; i++) { // 0 - 999사이의 인덱스 참조.
				if(j == nums[i]) {
					cnt[j - 1] ++;
				}
			}
			
		}
		// 검증
		int check = 0;
		for (int i = 0; i < cnt.length; i++) {
			System.out.println(i+1 + "이 나온 횟수 :" + cnt[i]);
			check += cnt[i];
		}
		System.out.println(check); // 1000이 되어야 
	}

}