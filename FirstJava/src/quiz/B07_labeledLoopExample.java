package quiz;

public class B07_labeledLoopExample {

	public static void main(String[] args) {
		// Labeled Loop
		// 루프 앞에 이름을 지정후 ":"를 사용.
		outer: for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if(j == 2) {
//					break outer; // 레이블이. outer인 반복문을 종료. outer를 추가시 j에서 2에 걸리면 바로 종료.
					continue outer;
				}
				System.out.println(i + "\t" + j);
			}
		}

	}

}
