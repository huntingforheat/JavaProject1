/*
 * 매운 것을 좋아하는 Leo는 모든 음식의 스코빌 지수를 K 이상으로 만들고 싶습니다. 
 * 모든 음식의 스코빌 지수를 K 이상으로 만들기 위해 Leo는 스코빌 지수가 가장 낮은 두 개의 음식을 아래와 같이 특별한 방법으로 섞어 새로운 음식을 만듭니다.
 * 
 * 섞은 음식의 스코빌 지수 = 가장 맵지 않은 음식의 스코빌 지수 + (두 번째로 맵지 않은 음식의 스코빌 지수 * 2)
 * 
 * Leo는 모든 음식의 스코빌 지수가 K이상이 될 때까지 반복하여 섞습니다.
   Leo가 가진 음식의 스코빌 지수를 담은 배열 scoville과 원하는 스코빌 지수 K가 주어질 때, 
   모든 음식의 스코빌 지 수를 K 이상으로 만들기 위해 섞어야 하는 최소 횟수를 return 하도록 Solution 함수를 작성해주세요
   
   
 */

package quiz;

import java.util.PriorityQueue;
import java.util.TreeSet;

public class Quiz_240321_AM2{

	public static void main(String[] args) {
		int[] scoville = {2, 3, 9, 10, 1, 12 };
		int K = 7;
		System.out.println("음식을 최소 몇번 섞었을 원하는 맵기가 될까? " 
		+ solution(scoville, K));

	}
	
	public static int solution(int[] scoville, int K) {
		int answer = 0;  //시도 횟수
		
		// scoville 값을 저장 : 음식
		PriorityQueue<Integer> que = new PriorityQueue<>();
		for (int i : scoville) {
			que.add(i);
		}
		System.out.println("PriorityQueue 내용 : "+que);
		
		while (true) {
			answer ++;
			int result = que.poll() + (que.poll()*2);
			que.add(result);
			System.out.println(answer +"번째 Que의 내용 : "+que);
			// 정해진 맵기 K값을 넘어서는 섞은 음식인 경우, 그 회사를 반환
			if(que.peek() >= K) return answer;
			// K이상으로 만들 수 없는 경우 반환값은 -1
			if(que.size() == 1) return -1;
		}
		
		
//		return answer;
	}

}
