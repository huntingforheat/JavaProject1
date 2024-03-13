package quiz;

import java.util.Scanner;

public class quiz_240312_PM5 {

	public static void main(String[] args) {
		// 5. 커피의 가격은 2000원, 10개 이상 구매하면 초과분에 대해서 
		//   커피는 1500원을 받는다. 
		//   커피의 개수를 입력받고, 총 가격이 얼만인지 계산하여 출력하는 
		//   프로그램을 만들어보세요!
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("커피 값 계산 프로그");
		System.out.print(">");
		int qty = scan.nextInt(); // 몇 잔?
		int price = 0;
		int normal_price = 2000;
		int discount_price = 1500;
//		if(qty > 10) {
//			price += (10 * normal_price) + (qty - 10) * discount_price;
//		}else {
//			price += qty * normal_price;
//		}
		
		switch (qty / 10) {
		case 0: // 10잔 미만
			price += qty * normal_price;
			break;
		default: // 10잔 이상
			price += (10 * normal_price) + (qty - 10) * discount_price;
			break;
		}
		
		System.out.println("커피 가격은 : " + price + "입니다.");
	}

}
