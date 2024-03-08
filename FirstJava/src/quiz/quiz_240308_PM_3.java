package quiz;

public class quiz_240308_PM_3 {

	public static void main(String[] args) {
//		3. 1 + (1+2) + (1+2+3) + (1+2+3+4) + (1+2+3+4+5)+ ... +(1+2+3+4+5+6+7+8+9+10)의 결과를 구하시오.
		
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i!=1) System.out.print("+(");
			for (int j = 1; j <= i; j++) {
				sum += j;
				System.out.print(j);
				if(j != i) System.out.print("+");
			}
			if (i !=1) System.out.print(")");
		}
		System.out.println("\n반복문 두개를 사용하여 풀어 본 결과 : "+sum);
		
		// 반복문을 하나 사용하는 경우...
		sum = 0;
		int sum2 = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i; 
			sum2 += sum;
		}
		System.out.println(sum2);
	}

}
