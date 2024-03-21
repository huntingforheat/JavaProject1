import java.util.ArrayList;

import generic.Person;

public class E12_genericEx2 {

	public static void main(String[] args) {
		Wallet<Card, Money> card_wallet = new Wallet<>("파란색");
		Wallet<CreditCard, Money> card_wallet2 = new Wallet<>("검은색");
		
//		Wallet<String, Integer> card_wallet3 = new Wallet<>("하늘색"); // card,money한테 상속받은 애들이 아니어서 불가능
		card_wallet.pouch.add(new CreditCard());
		card_wallet.pouch.add(new CheckCard());
		card_wallet.pouch.add(new BusCard());
//		card_wallet2.pouch.add(new CheckCard()); // CreditCard가 아니어서 제한사항에 걸림
		card_wallet2.pouch.add(new CreditCard());
		
		card_wallet2.pouch2.add(new Dollar());
		card_wallet2.pouch2.add(new Won());
		
		//
		ArrayList<Integer> int_list = new ArrayList<>();
		ArrayList<String> str_list = new ArrayList<>();
		ArrayList<Object> obj_list = new ArrayList<>();
		
		str_list.add("제너릭 떄문에 문자열만 들어갑니다.");
		str_list.add("이유는? 문자열 제너릭 컬렉션으로 지정되기 떄문");
		int_list.add(100);
		int_list.add(new Integer(20));
		obj_list.add(new Person<String>("홍길동", 11));
		
		usignArrayListMethod(obj_list);
		usignArrayListMethod(str_list);
		usignArrayListMethod(int_list);
		
		usignArrayListMethod(card_wallet);
		usignArrayListMethod(card_wallet2);

	}
	
	// 제너릭이 다른 것만으로 오버로딩은 할 수 없다는 것
//	static void usignArrayListMethod(ArrayList<Integer> list) {
//		System.out.println(list);
//	}
//	
//	static void usignArrayListMethod2(ArrayList<String> list) {
//		System.out.println(list);
//	}
	
	// <?> : 와일드 카드. 제너릭으로 오버로드를 구현하고 싶을 때 사용
	static void usignArrayListMethod(ArrayList<?> list) {
		System.out.println(list);
	}
	
	static void usignArrayListMethod(Wallet<? extends Card, ? extends Money> w) {
		System.out.println(w);
	}

}

// 제너릭에서 extends는 타입 범위를 제한하는 역할을 하게 됨.
//	- One extends Card : 첫번째 타입으로 Card를 상속받는 클래스만 허용
//	- Two extends Money : 두번째 타입으로 Money를 상속받는 클래스만 허용
													
class Wallet<One extends Card, Two extends Money> { // One은 부모가 카드인 애들은 첫번째 제너릭에 다 들어갈 수 있음(제한을 걸음)
	
	ArrayList<One> pouch;
	ArrayList<Two> pouch2;
	String color;
	
	public Wallet(String color) {
		this.pouch = new ArrayList<>();
		this.pouch2 = new ArrayList<>();
		this.color = color;
	}
	
	public One get(int index) {
		return pouch.get(index);
	}

	@Override
	public String toString() {
		return "지갑의 내용물을 출력합니다.";
	}
	
	
	
}

class Card {
	
}
class CreditCard extends Card {}
class CheckCard extends Card {}
class BusCard extends Card {}

class Money {
	
}
class Won extends Money {}
class Dollar extends Money {}
