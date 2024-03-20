
public class D17_stringStringBuilder {

	public static void main(String[] args) {
		// 성능비교
		long start, end;
		start = System.currentTimeMillis();
		
		String str = "A";		// String은 값이 변경될 떄마다 새로운 객체를 생성
		for(int i = 0; i < 300000; i++) {
			str = str + "A";
		}
		end  = System.currentTimeMillis();
		
		System.out.println("String : " + (end - start) * 0.001 + "초");
		
		// StringBuilder A붙이기
		start = System.currentTimeMillis();
		
		StringBuilder sb = new StringBuilder("A");
		for(int i = 0; i < 300000; i++) {
			sb.append("A");
		}
		end = System.currentTimeMillis();
		System.out.println("StringBuilder : " + (end - start) * 0.001 + "초");

	}

}
