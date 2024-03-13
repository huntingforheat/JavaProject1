
public class Monitor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MonitorExample acc1 = new MonitorExample(100, 100, 100, "off");
		System.out.println("상태 확인 : " + acc1.getResolution()+ "," + acc1.getSize()+ "," + acc1.getLight()+ ","  + acc1.getState());

	}

}

class MonitorExample {
	
	static final int MAX = 100;
	
	// 멤버 변수 - 속성.
	public int resolution;
	public int size;
	public int light;
	boolean state;
	
	// 생성자
	
	public MonitorExample() {
		super();
	}
	
	public MonitorExample(int resolution, int size, int light, String state) {
		this.resolution = MAX;
		this.size = MAX;
		this.light = MAX;
		this.state = false;
	}
	
	// 전원 메서드.
	public void pressPowerButton() {
		state = !state;

	}
	
	// 상태확인
	public int getResolution() {
		return resolution;
	}
	
	public int getSize() {
		return size;
	}
	
	public int getLight() {
		return light;
	}
	
	boolean getState() {
		return state;
	}
}