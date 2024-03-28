
public class H03_threadEx2 {
	
	/*
	 * 	[스레드 상태 제어] **
	 * 	  스레드 작업시 프로그램 중지 및 버그가 발생할 수 있는 부분
	 * 	- sleep() : 스레드를 원하는 시간만큼 멈추고 싶을 떄 사용
	 * 				InterruptedException처리를 강제하기 떄문에 try구문 사용
	 * 	- interrupt() : 스레드가 일시 정지 상태에 있을 때에 InterruptedException 예외발생
	 * 					run() 메서드가 정상종료 시킬 수 있게 한다.
	 * 	- join() : 다른 스레드 실행이 완료될때까지 기다리는 메서드
	 * 	- yield() : 다른 스레드에게 실행 양보하는 메서드
	 */

	public static void main(String[] args) {
		
		// sleep()
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				int i = 1;
				while(true) {
					// interrupt 확인
					System.out.println("t1 : " + i);
					i++;
					if(Thread.interrupted()) { // interrupt 발생 여부 확인 발생하면 true
						System.out.println("interrupt 발생 종료합니다.");
						break;
					}
					
					// sleep 확인
//					try {
//						
//						Thread.sleep(1000);
//
//					} catch (InterruptedException e) {
//						System.out.println(e.getMessage());
////						System.exit(0);
//					}
				}
				System.out.println("스레드 실행 종료");
			}
		});
		t1.start();
		
		// interrupt() 메서드 - 일시정지 상태일떄 InterruptedException으로 예외 발생
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		t1.interrupt(); // 스레드가 일시 정지 상태이면 예외 발생
		
		// join() 메서드
		Sum t2 = new Sum();
		Sum t3 = new Sum();
		
		t2.start();
		t3.start();
		try {
			t2.join();  // 조인을 만나는 순간 t1 스레드가 종료될떄까지 대기 t1 스레드가 5050값을 받아오기 전까지 대기
			t3.join();	// t2 스레드가 종료될떄까지 대기  ""
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("두 스레드의 Sum의 합계 : " + (t2.sum  + t3.sum));
		
		// yelid() : 다른 스레드에게 실행 양보
		YieldThread t4 = new YieldThread();
		YieldThread t5 = new YieldThread();
		
		t4.start();
		t5.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
	
		t4.isContinue = false; // 1초 있다가 t4 스레드의 yield가 동작 즉 t5한테 양보 함
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
		t4.isContinue = true; // t5한테 1초 양보 했다가 그 후에 t4 다시 동작
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}
		
		// 스레드 종료
		t4.isBreak = true;
		t5.isBreak = true;
	}
	

}

class Sum extends Thread {
	int sum = 0;
	@Override
	public void run() {
		for(int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
			sum += i;
		}
	}
}

class YieldThread extends Thread {
	boolean isBreak = false;
	boolean isContinue = true;
	
	@Override
	public void run() {
		while(!isBreak) {
			if(isContinue) {
				System.out.println(getName() + "실행 중");
			} else {
				Thread.yield();
			}
		}
		System.out.println(getName() + "종료");
	}
}