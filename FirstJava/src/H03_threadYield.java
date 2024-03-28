
public class H03_threadYield {

	public static void main(String[] args) {
		
		// yelid()
		YieldThread2 t4 = new YieldThread2();
		YieldThread2 t5 = new YieldThread2();
		
		t4.start();
		t5.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
	
		t4.isContinue = false; // 1초 있다가 t4 스레드의 yield가 동작 즉 t5한테 양보 함
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

		}
		t4.isContinue = true; // t5한테 1초 양보 했다가 그 후에 t4 다시 동작
		
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}
		
		// 스레드 종료
		t4.isBreak = true;
		t5.isBreak = true;

	}

}

class YieldThread2 extends Thread {
	boolean isBreak = false;
	boolean isContinue = true;
	
	@Override
	public void run() {
		while(!isBreak) {
			if(isContinue) {
				System.out.println(getName() + "실행 중");
			} else {
				System.out.println("동작");
				Thread.yield();  // 자원 양보 효율적인 자원 사용을 위해서 사용
			}
		}
		System.out.println(getName() + "종료");
	}
}

// 그러면 자원이 총 10이고 스레드 0과 스레드 1이 있으면 0이 자원 7을 사용하고 1이 자원 3을 사용하고 있을때
//	sleep(1000)에 yield를 사용하면 1초동안 0의 할당받은 7자원의 일부를 1한테 나눠준다? 
