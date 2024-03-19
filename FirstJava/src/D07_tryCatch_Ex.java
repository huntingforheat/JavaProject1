
public class D07_tryCatch_Ex {

	public static void main(String[] args) {
		// try ~ catch ~ finally ~
		int i = 0;
		String[] greetings = {"안녕하세요.", "반갑습니다.", "또 오세요"};
		while (i < 4) {
			try { // 예외가 있을만한 곳에 넣음
			System.out.println(greetings[i]);
			}catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("예외가 발생했습니다.");
				System.out.println("예외가 발생한 원인은" + e.getMessage());
				System.out.println("예외처리 작업 끝입니다.");
			}finally { // 무조건 안넣어도됨 finally는 작업이 끝나고 뭔가를 해야할 떄 사용
				System.out.println("finally는 항상 실행됨.");
			}
			i++;
		}
		System.out.println("메인의 마지막입니다.");

	}

}
