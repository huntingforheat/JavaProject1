package quiz;

class Airplane {
	
	String name;
	
	public String takeOff;
	public String fly;
	public String land;
	public int flyMode;
	
	public Airplane(String takeOff, String fly, String land, int flyMode) {
		this.takeOff = takeOff;
		this.fly = fly;
		this.land = land;
		this.flyMode = flyMode;
	}

	public String getTakeOff() {
		return takeOff;
	}
	
	public String getFly() {
		return fly;
	}
	
	public String getLand() {
		return land;
	}
	
	public int getFlyMode() {
		return flyMode;
	}
	
	public void setTakeOff(String takeOff) {
		this.takeOff = takeOff;
	}

	public void setFly(String fly) {
		this.fly = fly;
	}

	public void setLand(String land) {
		this.land = land;
	}

	public void setFlyMode(int flyMode) {
		this.flyMode = flyMode;
	}
	
	public String getDetails() {
		return "[출발 :" + takeOff + "\t비행 :" + fly + "\t착륙 : " + land + "\t비행모드 : " + flyMode + "]";
	}
	
}

class SuperSonicAp extends Airplane {
	
	/*
	 *  Airplane은 멤버 변수로 name을 가지고 있습니다. 
	 *  생성자로 이름을 입력받아 초기화 받게 설정하고, 
	 *  메서드는 takeOff(), fly(), land() 3가지를 가지고 있습니다.
	 * 
	 *  1. Airplane을 생성 상속 받습니다. 생성자는 이름을 받아서 초기화
	 *  2. flyMode는 int형 변수로 선언합니다.
	 *  3. fly() 메서드를 오버라이딩 합니다.
	 *     fly() 메서드 안에서는 flyMode가 1이면 "고속 모드로 비행합니다." 출력
	 *     	flyMode가 0이라면, super를 통해 부모님의 메서드를 호출
	 */

	public SuperSonicAp(String takeOff, String fly, String land, int flyMode) {
		super(takeOff, fly, land, flyMode);
		// TODO Auto-generated constructor stub
	}
	
	public int getFlyMode() {
			return flyMode;
	}
	
	public void setFlyMode(int flyMode) {
		if(flyMode == 1) {
			System.out.println("고속 모드로 비행합니다.");
			return;
		} else if(flyMode == 0) {
				super.getFlyMode();
		}
	}
	
	@Override
	public String getDetails() {
		return "[출발 :" + takeOff + "\t비행 :" + fly + "\t착륙 : " + land + "]";
	}
}
public class Quiz_240314_PM {
	
	public static void main(String[] args) {
		SuperSonicAp myFlyMode = new SuperSonicAp();
		
	}
}
