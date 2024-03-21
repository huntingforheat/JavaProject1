/*
 * 	수많은 마라톤 선수들이 마라톤에 참여하였습니다.
	단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
	마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주 어질 때, 
	
	마라톤에 참여한 선수 (participant) - leo, kiki, eden 							return leo;
								  - marina, josipa, nikola, vinko, filipa 	return vinko;
								  - mislav, stanko, mislav, ana 			return mislav;
	
	마라톤에 완주한 선수 (completion) - eden, kiki 								return leo;
								 - josipa, filipa, marina, nikola			return vinko;
								 - stanko, ana, mislav						return mislav;
	
	완주하지 못한 선수의 이름을 return 하도록 Solution 함수를 작성해주세요.
	
	- completion의 길이는 participant의 길이보다 1 작습니다.
 	- 참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
 	- 참가자 중에는 동명이인이 있을 수 있습니다.
 */

package quiz;

import java.util.HashMap;

public class Quiz_240321_AM {

	public static void main(String[] args) {
		// 참가자
		String[] first_pa = {"leo","kiki","eden"};
		String[] second_pa = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] third_pa = {"mislav", "sanko", "mislav", "ana"};
		
		// 완주자
		String[] first_com = {"kiki", "eden"};
		String[] second_com = {"marina", "josipa", "nikola", "filipa"};
		String[] third_com = {"sanko", "mislav", "ana"};
		
		System.out.println("첫번째 사례 : " + solution(first_pa, first_com));
		System.out.println("두번째 사례 : " + solution(second_pa, second_com));
		System.out.println("세번째 사례 : " + solution(third_pa, third_com));
	}
		
		public static String solution(String[] participant, String[] completion) {
			String answer = "";
			HashMap<String, Integer> hm = new HashMap<>();
			for(String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1); // 디폴트 값을 0으로 이름 중복자가 있기 떄문
			System.out.println("참가자 결과 : " + hm);
			for(String player : completion) hm.put(player, hm.get(player) - 1); // 완주 못한사람 1로 리턴
			System.out.println("완주자 처리 결과 : " + hm);
			for(String key : hm.keySet()) {
				if(hm.get(key) != 0) {
					answer = key;
				}
			}
			return answer;
	}

}
