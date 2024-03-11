package quiz;

public class quiz_while {

	public static void main(String[] args) {
		// while문을 이용하여
		// 구구단을 다음과 같이 세로로 출력해 보세요
		
		int i = 2;
		int j = 1;
		
		while (i < 10) {
			while (j < 10) {
			System.out.println(i + "X" + j + "=" + (i*j));
				j++;
			}
			System.out.println();
			i++;
			j = 1;

	}
		
		int gop = 0;
		while (gop <= 9) {
			
			int dan = 2;
			
			while (dan <= 9) {
				if (gop == 0) {
					System.out.print(dan + "단\t");
				} else {
					System.out.printf("%dx%d=%d\t", dan, gop, dan*gop);
				}
				
				dan ++;
			}
			System.out.println();
			
			gop ++;
		}

}
}
