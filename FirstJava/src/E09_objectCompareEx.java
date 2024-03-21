import java.util.TreeSet;

import compare.DogComparator;
import obj.Dog;

public class E09_objectCompareEx {

	public static void main(String[] args) {
		// 비교 객체 확인
		Dog d1 = new Dog("진돗개", "뽀삐", 15);
		Dog d2 = new Dog("말티즈", "삐삐", 5);
		Dog d3 = new Dog("진돗개", "뽀삐", 15);
		
		// Dog d3와 d1의 비교
		System.out.println(d1 == d3); // 저장위치가 다르므로 false가 나옴
		System.out.println(d1.equals(d3)); // 객체비교는 equals로 안에 값이 같은지를 확인
		System.out.println(d1);
		System.out.println(d3);
		
		// Comparable 인터페이스를 구현한 경우
//		TreeSet<Dog> treeTest = new TreeSet<>(); // TreeSet은 비교를 하기위한 comparable, compareTo을 써줘야함
//		System.out.println(treeTest.add(d1));
//		System.out.println(treeTest.add(d2));
//		for (Dog dog : treeTest) {
//			System.out.println(dog);
//		}
		
		// Comparator를 이용한 경우
		TreeSet<Dog> treeTest2 = new TreeSet<Dog>(new DogComparator());
		System.out.println(treeTest2.add(d1));
		System.out.println(treeTest2.add(d2));
		for (Dog dog : treeTest2) {
			System.out.println(dog);
		}
	}

}
