package quiz;

public class Quiz_240312_PM {

	public static void main(String[] args) {
				// 1. 소수(PrimeNumber) 구하기
				//   소수는 1과 자기 자신만으로 나누어지는 수를 말함. 
				//   조건문과 반복문을 사용하여 100이하의 소수를 출력해 보세요
				//   (for문 안에 for문)
		for(int i = 1; i <= 100; i++) {
			int count = 0;
				
			for(int j = 1; j < i; j++) {
				if(i % j == 0) {
					count ++;
					}
				}
			if(count == 2) {
				System.out.println(i);
			}
		}
	}

}
