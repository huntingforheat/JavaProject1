package obj.inheritance.goodcase;

import obj.inheritance.Person;

public class Teacher extends Person {

	public String teacherId;
	public String subject;
	
	public Teacher() {}
	
	public Teacher(String name, int age, String subject) {
		super(name, age); // 부모클래스의 name, age 가져오기
		this.subject = subject;
	}

	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return "[이름: " + name + "\t나이 : " + age + "\t교번 : " + teacherId + "\t과목 : " + subject + "]";
	}

}
