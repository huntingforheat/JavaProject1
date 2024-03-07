package quiz;

public class quiz_02 {

	public static void main(String[] args) {
		// 11개 지하철역 지나는데 출발역에서 도착역까지 37분 소요 소수점 두자리까지
		
		double a = 37;
		double b = 11;
		double result = a / b;
		//double result = (int)((a/b)*100)/100.0;
		System.out.printf("한 역에 걸리는 시간 : " + String.format("%.2f", result));
	}

}
