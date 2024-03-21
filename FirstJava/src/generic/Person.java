package generic;

public class Person<E> {
	
	private E name;
	private int age;
	
	public Person(E name, int age) {
		this.name = name;
		this.age = age;
	}

	public E getName() {
		return name;
	}

	public void setName(E name) {
		this.name = name;
	}
	
	// 메서드
	// 클래스 선언부에서 정의(E)되지 않은 유형 매개변수를 사용하는 방법
	public <T extends Object> T test(T t) { // <>안에 작업되어 있는것이 제너릭 선언부에서 선언하지 않아도 <>로 선언 가능
		return t;
	}
	
	
}
