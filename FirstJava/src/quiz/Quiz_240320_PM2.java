/*
 * [[[2. 로또 번호 생성하기]]]
    TreeSet을 이용하여 로또번호 6개를 생성하는 프로그램을 작성하세요!!!
     1. TreeSet을 생성하세요
     2. 무한루프를 사용하여 1 ~ 45까지의 난수를 발생시키세요. 
     3. 발생한 난수를 추가합니다. 
     4. 크기가 6이되면 무한 루프를 빠져 나옵니다.
 */

package quiz;

import java.util.Random;
import java.util.TreeSet;

public class Quiz_240320_PM2 {

	public static void main(String[] args) {
		TreeSet<Integer> ts1 = new TreeSet<>();
		
		Random r = new Random();
		while(true) {
			int rn = r.nextInt(45)+1;
			
			ts1.add(rn);
			
			if(ts1.size() == 6) break;
		}
		System.out.println("로또 번호 : " + ts1);
		
	}
	

}
