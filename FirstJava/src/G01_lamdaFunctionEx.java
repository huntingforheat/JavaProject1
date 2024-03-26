
public class G01_lamdaFunctionEx {
	
	// 람다식 (간결한 코드를 위해서 사용)
	// 고전적인 방식인 객체지향적인 프로그램 방식이 아닌 함수적 프로그램밍을 위한 기법에 사용
	// 람다식은 익명함수를 위한 방식. 람다는 기존방식보다 자바코드를 간결하게 표현할 수 있다는 장점을 가지고 있음.
	// 다만, 처음에는 익숙하지 않아 혼란스러울 수 있음.
	
	// 람다식은 함수적 인터페이스를 자료형으로 사용.
	// 함수적 인터페이스란? 추상 메서드가 한개만 존재하는 인터페이스를 의미함.
	
	// 람다식의 표현
	// (타입 매개변수) -> { 실행문들. }
	// 매개변수가 없는 경우에는 () -> {} 식으로 표현이 됩니다.
	// 매개변수가 한개라면 ()를 생략하여 표현하는 것도 가능합니다.
	
	// 람다식은 함수적 인터페이스를 사용하여
	// 인터페이스 변수 = 람다식; 같은 구조로 처리가 됩니다.
	// 매개변수가 하나 이상이면 람다식이 아님

	public static void main(String[] args) {
		// 첫번쨰 람다식
		InterfaceEx ie = (int x, int y) -> x + y; // {}는 한줄이기 때문에 생략
		System.out.println(ie.sum(10, 20));
		
		// 함수적 인터페이스
		LambdaInterface li = () -> { // 함수적 인터페이스는 한개만 있어야 함
			String str = "메서드 출력";
			System.out.println(str);
		};
		li.print();
		
		// 표준
//		LambdaInterface3 li3 = (String name) -> {
//			System.out.println("제 이름은 " + name + "입니다.");
//		};
		
		// String
//		LambdaInterface3 li3 = (name) -> {
//			System.out.println("제 이름은 " + name + "입니다.");
//		};
		
		// () 생략 - 하나의 매개변수일 경우
//		LambdaInterface3 li3 = name -> {
//			System.out.println("제 이름은 " + name + "입니다.");
//		};
		
		// {}는 하나의 실행문으로 처리될 때
		LambdaInterface3 li3 = name -> System.out.println("제 이름은 " + name + "입니다.");
		
		li3.print("홍길동");
		
		LambdaInterface4 li4 = (x, y) -> {
			return x * y;
		};
		System.out.println("두수의 곱 : " + li4.cal(3, 2));
		
		li4 = (x, y) -> x + y;
		System.out.println("두수의 합 : " + li4.cal(3, 2));
		
		li4 = (x, y) -> {return x/y;}; // 중괄호 쓸때는 리턴을 써줘야함
		System.out.println("두수의 몫 : " + li4.cal(5, 2));
		
		li4 = (x, y) -> x % y;
		System.out.println("두수의 나머지 : " + li4.cal(5, 2));
		
		li4 = (x, y) -> sum(x, y);
		System.out.println("두수의 합 : " + li4.cal(10, 20));
		
		// 람다식에 사용되는 this
		// 람다식은 내부클래스의 익명 객체로 인식하므로 , 내부에 this는 람다 객체 그 자신을 의미
		// 즉, 내부 클래스와 같이 람다 표현식 내에서 지역변수 접근시 지역변수는 상수화 해야 함. (상수화는 final)
		
		Outer o = new Outer();
		o.method();
		
	}
	
	static int sum(int x, int y) { // 다른 메서드
		return x + y;
	}

}


interface InterfaceEx {
	public int sum(int x, int y);
}

@FunctionalInterface		// 해당 인터페이스가 함수적 인터페이스임을 알림
interface LambdaInterface {
	void print();
//	void print2();  // 오류 발생
}

@FunctionalInterface
interface LambdaInterface3 {
	void print(String name); // 매개변수는 있고, 반환타입은 없는 경우 
}

@FunctionalInterface
interface LambdaInterface4 {
	int cal(int x, int y);
}

@FunctionalInterface
interface LambdaInterface5 {
	void method();
}

class Outer {  // 함수적 익명객체를 람다식으로 표현
	public int iv = 10; // 멤버변수
	void method() {
		final int iv = 40; // 지역변수
		LambdaInterface5 f5 = () -> {
			
			System.out.println("Outer.this.iv : " + Outer.this.iv);
			System.out.println("this.iv : " + this.iv); // 해당 자기자신 객체의 this
			System.out.println("iv : " + iv); // 똑같은 이름을 가지고 있으면 그냥 부르면 가까이에 있는 값을 불러옴
		};
		f5.method();
	}
}
