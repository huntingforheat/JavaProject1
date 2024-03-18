package obj.objectclass;

import obj.inheritance.Person;

public class ObjectExample {

	public static void main(String[] args) {
		Object obj = new Object(); // 최상위 객체
		obj.hashCode(); // 객체 동등 비교를 위해서 사용하는 메소드
		obj.equals(obj); // 객체 동등 비교를 위해서 보통은 재정의해서 사용
		obj.toString(); // 기본적으로 클래스명@hashcode 값으로 출력
						// 재정의해서 객체 내의 정보를 확인하는 용도로 사용됩니다.
		
		Person p1 = new Person(20, "홍길동");
		Person p2 = new Person("홍길동", 20, 185.0f, 0);
		System.out.println("p1의 hashCode 값 : " + p1.hashCode());
		System.out.println("p2의 hashCode 값 : " + p2.hashCode());
		System.out.println("p1과 p2의 비교 결과 : " +(p1.hashCode() == p2.hashCode())); // hascode는 서로 같은값인지 비교할떄 사용.
		
		Person o1 = new Person("홍길동", 20);
		Person oto1 = o1; // 얕은 복사
		Person o2 = new Person("홍길동", 20);
		System.out.println("o1의 해쉬값 : " + o1.hashCode());
		System.out.println("o2의 해쉬값 : " + o2.hashCode());
		System.out.println("oto1의 해쉬값 : " + oto1.hashCode());
		System.out.println("o1과 o2의 비교 결과 : " +(o1.hashCode() == o2.hashCode())); // hascode는 서로 같은값인지 비교할떄 사용.
		System.out.println("o1과 o2의 equals 사용 : " + o1.equals(o2));
		
		Person p3 = new Person();
		System.out.println(new String("hello").hashCode()); // 해쉬코드를 수정하여 같은값을 사용하여 해쉬값이 같음
		System.out.println("hello".hashCode());
		
		// 객체를 비교할때 equals()를 사용 절대 ==을 사용하지 않음
		
		p3.name = "홍길동";
		p3.age = 20;
		System.out.println("hash값 비교");
		System.out.println(p1.hashCode());
		System.out.println(p3.hashCode());
		
		System.out.println("p3 객체의 getClass()의 결과 : "  + p3.getClass().toString());
		System.out.println("p3와 p2값의 equals()의 결과 : " + p3.equals(p2));
		//System.out.println(toString);
	}

}
