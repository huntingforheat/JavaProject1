
interface MyInterface1 {
	default void defaultMethod() {
		System.out.println("MyInterface1의 default 메서드");
	}
	
	static void staticMethod() {
		System.out.println("MyInterface1의 static 메서드");
	}
}

interface MyInterface2 {
	default void defaultMethod() {
		System.out.println("MyInterface2의 default 메서드");
	}
	
	static void staticMethod() {
		System.out.println("MyInterface2의 static 메서드");
	}
}

class Parent1 {
	public void method() {
		System.out.println("Parent 클래스의 method2");
	}
}

class Child extends Parent1 implements MyInterface1, MyInterface2{
	@Override
	public void defaultMethod() {
		System.out.println("Child 클래스의 default 메서드");
		MyInterface1.super.defaultMethod();
		MyInterface2.super.defaultMethod();
	}
}

public class D05_defaultinterface {

	public static void main(String[] args) {
		Child c = new Child();
		c.defaultMethod();
		c.method();
		
		MyInterface1.staticMethod();
		MyInterface2.staticMethod();

	}

}
