import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class G13_sortingEx {
	
	/*
	 *  Stream의 중간 단계에서 sorted메서드를 사용하여 순서를 변경할 수 있음. 
	 *  일반적인 객체를 정렬하기 위해서는 Comparable 인터페이스를 구현한 클래스 객체만 정렬
	 *  가능합니다. 
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = Arrays.asList("홍길동", "김유신","이순신","유관순");
		
		System.out.println("기본 정렬");
		list.stream().sorted().forEach(System.out::println);  // 메서드 참조 방식
		System.out.println();

		System.out.println("역순 정렬");
		list.stream().sorted(Comparator.reverseOrder())
							  .forEach(System.out::println);  // 메서드 참조 방식
		System.out.println();
		
		//일반 객체 정렬 테스트
		Shape1 s1 = new Rectangle1(10, 3);
		Shape1 s2 = new Circle1(10);
		Shape1 s3 = new Rectangle1(20, 2);
		Shape1 s4 = new Circle1(11);
		
		List<Shape1> list2 = Arrays.asList(s1, s2, s3, s4);
		
		System.out.println("오름차순 정렬");
		list2.stream().sorted().forEach(System.out::println);
		
		System.out.println("내림차순 정렬");
		list2.stream().sorted((a, b) -> b.compareTo(a) - a.compareTo(b))
					.forEach(System.out::println);
		
		System.out.println("내림차순 정렬2");
		list2.stream().sorted(Comparator.reverseOrder())
					.forEach(System.out::println);
		
		// 둘레를 기준으로 정렬
		System.out.println("정렬하지 않고 출력");
		list2.stream().forEach(System.out::println);
		
		System.out.println("둘레(length()) 순으로 정렬");
		System.out.println("함수적 인터페이스로 구현");
		list2.stream().sorted(new Comparator<Shape1>() {
			public int compare(Shape1 o1, Shape1 o2) {
				return (int)(o1.length() - o2.length());
			};
		}).forEach(System.out::println);
		
		System.out.println("람다표현식을 이용해서 둘레순으로 정렬");
		list2.stream().sorted((a, b) -> (int)(a.length() - b.length()))
					.forEach(System.out::println);
	}

}

abstract class Shape1 implements Comparable<Shape1> {
	//필드
	int x, y;
	
	//생성자
	Shape1() {
		this(0, 0);
	}
	
	Shape1(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//추상 메서드
	abstract double area();
	abstract double length();
	
	//일반 메서드
	public String getLocation() {
		return "x: "+x+", y: "+y;
	}
	
	@Override
	public int compareTo(Shape1 o) {
		return (int)(this.area() - o.area());
	}
}

class Rectangle1 extends Shape1 {
	
	// 필드
	int w, h;
	
	//생성자
	public Rectangle1() {
		this(1, 1);
	}
	
	public Rectangle1(int w, int h) {
		this.w = w;
		this.h = h;
	}

	@Override
	double area() {
		return (w*h);
	}

	@Override
	double length() {
		return (w+h) * 2;
	}
	
	@Override
	public String toString() {
		return "넓이 : "+this.area();
	}
	
}

class Circle1 extends Shape1 {
	
	//필드 
	double r;
	
	//생성자 
	public Circle1() {
		this(1);
	}

	public Circle1(double r) {
		this.r = r;
	}

	@Override
	double area() {
		return (r * r) * Math.PI;
	}

	@Override
	double length() {
		return (r * 2) * Math.PI;
	}
	
	@Override
	public String toString() {
		return "넓이는 : "+this.area();
	}
	
}