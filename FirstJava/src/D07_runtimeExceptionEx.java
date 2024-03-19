
public class D07_runtimeExceptionEx {

	public static void main(String[] args) throws Exception {
		// Runtime Exception => UncheckedException
//		makeException1(4);
		//makeException2(2);
		try {makeException3();
			makeException4();
			makeExcption5();
			makeException7();
			}
		catch (Exception e) {
			System.out.println("예외발생");
		}
//		makeException4();
		
		makeException8();

	}
	
	public static int makeException1(int input) {
		int divide = 0;
		int result = input / divide;
		return result;
	}
	
	public static void makeException2() {
		String s = "가";
		System.out.println(s.charAt(1));
	}

	public static void makeException3() throws Exception {
		int[] a = {1, 2, 3};
		System.out.println(a[3]);
	}
	
	public static void makeException4() {
		String nothing = null;
		System.out.println(nothing.split("")); // split은 문자를 나누는것
	}
	
	public static void makeExcption5() {
		String notInt = "가나다";
		int a = Integer.parseInt(notInt);
	}
	
	public static void makeException6() {
		for(int i = 0; i < Integer.MAX_VALUE; i++) { // int의 최대값 2^32, 메모리참조
			makeException6();
		}
	}
	
	public static void makeException7() { // arraystoreException
		Object[] objArr = new String[3];
		objArr[0] = 0; // 선언자체가 Object로 되어 있으므로 컴파일 오류 발생 x
	}
	
	public static void makeException8() { // ClassCastException 캐스팅 오류
		Object[] objArr = new String[3];
		objArr[0] = "0";
		Integer a = (Char) objArr[0]; // 0은 정수가 아니어서 오류 0은 문자열
	}
}
