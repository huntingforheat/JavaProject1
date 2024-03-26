package obj;

import java.io.Serializable;

public class Customer implements Serializable { // 직렬화 하려면 Serializable이라는 인터페이스를 넣어줘야함
	
	private static final long serialVersionUID = -1L; // 객체를 구분하기 위한 고유값 아무 값이나 넣어도 됨.
	
	private String name;
	private char gender;
	private String email;
	private int birthYear;
	private transient boolean isJoin;
	
	// 기본 생성자
	
	public Customer() {}
	
	// 필드 생성자
	
	public Customer(String name, char gender, String email, int birthYear) {
		this.name = name;
		this.gender = gender;
		this.email = email;
		this.birthYear = birthYear;
	}
	
	// getter, setter
	
	public String getName() {
		return name;
	}

	public char getGender() {
		return gender;
	}

	public String getEmail() {
		return email;
	}

	public int getBirthYear() {
		return birthYear;
	}
	
	public boolean getIsJoin() {
		return isJoin;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	public void setIsJoin(boolean isJoin) {
		this.isJoin = isJoin;
	}
	
	// toString
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", gender=" + gender + ", email=" + email + ", birthYear=" + birthYear + "]";
	}
	
}
