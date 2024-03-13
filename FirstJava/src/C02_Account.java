import obj.Account;

public class C02_Account {

	static final int MAX = 100;
	
	static String[] nameList = new String[MAX];
	static String[] numList = new String[MAX];
	static int[] pwdList = new int[MAX];
	static int[] depList = new int[MAX];
	
	public static void main(String[] args) {
		// 클래스명 : Account
		// 속성 : 이름, 계좌번호, 패스워드, 예금, 이자
		// 기능 : 입금, 출금, 예금 확인
		// 생성자 : 이름, 계좌번호, 패스워드, 예금을 이용한 오버로
		
		Account name = new Account("홍길동");
		Account num = new Account("22222222-2222222");
		Account pwd  = new Account("123546456");
		Account dep = new Account("0");
		
		
		

	}

}
