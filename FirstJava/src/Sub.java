import obj.modifier.Super;

public class Sub extends Super {
	
	private int num5 = 50;
	
	public void print() {
		System.out.println("Super num1 = " + num1);
		System.out.println("Super num2 = " + num2);
//		System.out.println("Super num3 = " + num3); // default 같은 패키지가 아니어서 접근 X
//		System.out.println("Super num4 = " + num4); // private 이므로 getter으로 가져와야 됨.
		System.out.println("Super num4 = " + getNum4());
		System.out.println("Sub num5 = " + num1);

	}

}
