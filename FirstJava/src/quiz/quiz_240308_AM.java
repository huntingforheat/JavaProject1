package quiz;

public class quiz_240308_AM {

	public static void main(String[] args) {
		// quiz1 
		// 1 ~ 101미만의 임의 정수를 생성하고, 그 숫자가 짝수인지 홀수인지 출력하세요.(3항 연산식을 사용)
		// quiz2
		// -5 ~ 5 사이의 임의 정수를 생성하고, 삼항연산식을 사용하여 절대값을 출력하세요.
		// quiz3
		// 정수를 입력받아 그 수가 짝수 인지 홀수인지 출력하는 프로그램을 작성하세요.(삼항연산식 사용)
		// quiz4 중첩 if
		// 키와 나이를 입력받아서 키는 140이상, 나이는 8살 이상인 경우만 놀이기구에 탑승여부를 결정하는 프로그램을 작성하세요.
		// 조건 : 키 - 140 이상, 나이는 8살 이상
		// quiz5 
		// 정수 두개를 입력받아서 큰수를 출력. 같은 경우에는 같다고 출력하는 프로그램을 작성하세요.
		// quiz6
		// 정수를 입력받아서 양의 정수인 경우에는 짝수, 홀수를 구분하고, 0이면 0입니다를 출력, 음수인 경우에는 음의 정수입니다를 출력하는 프로그램을 작성하세요.
		// quiz7
		// switch를 사용하여 수박, 사과, 멜론, 포도, 귤을 구매시 가격을 출력하는 프로그램을 작성하세요.
		
		int num = (int)(Math.random()*100) + 1;
		System.out.println("숫자 : " + num);
		System.out.println("3항 연산의 결과 :" +(num%2 == 0? "짝수." : "홀수."));

		if(num % 2 == 0) {
			System.out.println("짝수입니다.");
		}else {
			System.out.println("홀수입니다.");
		}
		
		
		

	}

}
