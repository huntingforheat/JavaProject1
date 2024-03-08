package quiz;

public class quiz_240308_AM_2 {

	public static void main(String[] args) {
		// quiz2
		// -5 ~ 5 사이의 임의 정수를 생성하고, 삼항연산식을 사용하여 절대값을 출력하세요.
		
		// 0 <= x <= 10, y가 -5 <= y <= 5
		
		int num2 = 5 - (int)(Math.random()*11);
		System.out.println("랜덤 수는 :" + num2);
		int abs = (num2 >=0 ? num2 : -num2); // num2 => num2 * -1
		System.out.println(num2+"의 절대값은 : "+abs);

	}

}
