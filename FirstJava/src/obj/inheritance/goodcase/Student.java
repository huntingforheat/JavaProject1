package obj.inheritance.goodcase;

import obj.inheritance.Person;

public class Student extends Person {

	public String studentId;
	public String major;

	/*
	 * this와 super
	 * 	- this
	 * 	 > this는 현재 객체(자기 자신)
	 * 	 > this. (.은 직접참조)
	 * 		- 변수 또는 메서드를 참조
	 * 		- this.name => 자기 자신의 name 멤버변수를 참조
	 * 		- this.go() => 자기 자신의 go() 메서드를 참조하겠다.
	 * 	 > this()
	 * 		- 자기 자신 클래스 내의 다른 생성자를 참조
	 * 		- this(); => 기본 생성자를 참조
	 * 		- this("hello"); => 자신이 가지고 있는 생성자를 호출. 인자 값을 처리하는 생성자
	 * 	- super
	 * 	 > super는 현재 객체의 부모 객체, 한단계 위 부모를 의미함.
	 * 	 > super.
	 * 		- 부모의 변수 또는 메서드를 참조
	 * 		- super.name => 부모의 name 멤버변수를 참조
	 * 		- super.go() => 부모의 go() 메서드를 참조
	 * 	 > super()
	 * 		- 부모 생성자를 참조
	 * 		- super() => 부모의 기본 생성자를 참조
	 * 		- super(10, 20) => 부모의 해당 인자값을 처리하는 생성자를 참조
	 * 		- super("hello")
	 */
	
	public Student() {
		
	}

	public Student(String name, int age) { // 자식 생성자
		super(name, age); // 슈퍼니깐 부모(Person)의 생성자 name, age를 상속 받아옴
	}
	
	public Student(String name, int age, String studentId, String major) {
		this(name, age); // 이거는 위에 자식 생성자를 부른것
		height = 180.2f; // 부모의 멤버중 protected 멤버 변수.
//		weight = 100.0f; // default로 참조가 되지 않음.
		this.studentId = studentId; // 직접참조
		this.major = major; // 직접참조
	}
	
	public void study() {
		System.out.println(name + "은/는 공부합니다");
	}
	
	// Overriding이란?
	// 부모 클래스로부터 상속받은 메서드를 자식 클래스에서 행위(Method)를 바꾸거나 보완하기 위해서 다시 정의해서 사용하는 것 (재정의)
	//
	// 재정의 규칙
	//  - 상속을 전제로 함
	//  - 리턴 타입, 메서드 이름, 파라미터 변수 선언이 일치해야 함.
	//	- 접근 제한자는 같거나 more public해야 함.
	//	  private < default < protected < public

	@Override // 오버라이드는 상속받은 내용을 다르게 사용할떄 사용
	public String getDetails() {
		// TODO Auto-generated method stub
		return "[이름: " + name + "\t나이 : " + age + "\t학번 : " + studentId + "\t전공 : " + major + "]";
	}

}
