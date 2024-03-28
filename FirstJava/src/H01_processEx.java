import java.io.IOException;

public class H01_processEx {
	
	/*
	 * 	스레드 (동시에 여러 프로그램 실행)
	 * 	 프로세스란 실행중인 프로그램을 의미
	 * 	 스레드 - 프로세스 안에서 작업을 수행하는 것
	 * 	 프로세스에는 반드시 하나 이상의 스레드가 존재합니다.
	 * 
	 * 	 * 멀티스레드 장점
	 * 		- CPU, 메모리를 효율적으로 사용할 수 있다.
	 * 		- 사용자에 대한 응답성이 높아진다.
	 * 		- 작업을 스레드 단위로 분리해서 실행시간을 줄여 줄 수 있다.
	 * 
	 * 	 * 단점
	 * 		- 동기화, 공유 자원의 문제(교착상태 - deadlock) 발생률 증가
	 * 
	 */

	public static void main(String[] args) {
		// 프로세스 실행

		try {
            Process p1 = Runtime.getRuntime().exec("open -a Terminal.app");
            Process p2 = Runtime.getRuntime().exec("open -a App Store.app");
            
            p1.waitFor();
            p2.destroy();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
		
		//		try {
//			// 메모장 실행
//			Process p1 = Runtime.getRuntime().exec("open -a \"App Store\"");
//			// 날씨 실행
//			//Process p2 = Runtime.getRuntime().exec("Weather.app");
//			
//			p1.waitFor(); 	// p1 프로세스가 종료될떄까지 대기
//			//p2.destroy();	// p1 프로세스가 종료되면 실행. destroy 강제종료
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

	}

}
