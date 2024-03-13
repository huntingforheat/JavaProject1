package quiz;

public class quiz_240312_PM6 {

	public static void main(String[] args) {
		// 6. 램덤으로 알파벳 대문자 50개 생성하여 출력하는 프로그램을 만들어 보세요. 
		//   출력은 10줄 마다 줄바꿈해서 출력되게 해주세요. 
		//   예> 	DEFDEGSDFE
		//       	ADEFSGESGS
		//          ...
		
		int symbol_size = 'Z' - 'A' + 1; // 26
		for (int i = 0; i < 50; i++) {
			char ch6 = (char)(Math.random() * symbol_size + 'A');
			System.out.print(ch6);
			if(i % 10 == 9) System.out.println(); // 마지막이 9일때 줄바꿈 해야되니 == 9
		}

	}

}
