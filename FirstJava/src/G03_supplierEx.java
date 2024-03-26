import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class G03_supplierEx {
	
	// Supplier 함수적 인터페이스 : 매개변수 X, 반환값 있음
	/*
	 *	인터페이스 			추상 메서드
	 *	Supplier<T>			T get()
	 *	BooleanSupplier		boolean getAsBoolean()
	 *	DoubleSupplier		double getAsDouble()
	 *	IntSuppier			int getAsInt()
	 *	LongSupplier		long getAsLong()
	 */

	public static void main(String[] args) {
		
		Supplier<String> s1 = () -> {
			return "홍길동";
		};
		System.out.println(s1.get()); // 리턴값을 반환값으로 가져온다.
		
		s1 = () -> "이순신";
		System.out.println(s1.get());
		
		IntSupplier s2 = () -> {
			int num = (int)(Math.random()* 6) + 1;
			return num;
		};
		System.out.println("주사위 값 : " + s2.getAsInt());
		
		DoubleSupplier s3 = () -> Math.PI;
		System.out.println("파이 값  : " + s3.getAsDouble());
	}

}
