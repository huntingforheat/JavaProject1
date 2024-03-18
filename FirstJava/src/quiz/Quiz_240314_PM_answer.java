package quiz;

class Airplane {
	// 멤버변수
	String name;
	
	// 생성자
	public Airplane(String name) {
		this.name = name;
	}
	
	// 메서드
	void takeOff() {
		System.out.println("비행기가 이륙합니다.");
	}
	
	void fly() {
		System.out.println("일반 모드로 비행합니다.");
	}
	
	void land() {
		System.out.println("비행기가 착륙합니다.");
	}
}

class SuperSonicAp extends Airplane {
		
	int flyMode;
		
	public SuperSonicAp(String name) {
		super(name);
			
		}
	
	@Override
	void fly() {
		if(flyMode == 0) {
			super.fly();
		}else if(flyMode == 1) {
			System.out.println("고속 모드로 비행합니다.");
		}
	}
		
	
	
	
}

public class Quiz_240314_PM_answer {

	public static void main(String[] args) {
		
		// 비행기 SuperSonicAp
		SuperSonicAp s1 = new SuperSonicAp("스텔스");
		s1.takeOff();
		s1.fly();
		s1.flyMode = 1;
		s1.fly();
		s1.flyMode = 0;
		s1.land();
	}

}
