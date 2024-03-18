
/*
 * ### 다중 상속-인터페이스, 추상 클래스 비교!!!

   인터페이스 
    - 구현 객체의 같은 동작을 보장하는 용도
  
   추상클래스
    - 추상클래스를 상속받아 기능을 이용 및 확장하는 용도
    
 
  Ex) 동물은 육지동물과 해양동물을 가리지 않고 자다, 먹다는 개념이 있다.  
  > 동물 (자다, 먹다)
  > 육지 동물 - 개(자다 - 개는 잠을 잡니다., 먹다 - 개는 사료를 먹습니다.),  			개, 호랑이
          호랑이(자다 - 호랑이는 잠을 잡니다., 먹다 - 호랑이는 고기를 먹습니다.)
  > 해양 동물 - 금붕어(자다 - 금붕어는 잠을 잡니다., 먹다 - 금붕어는 플랑크톤을 먹습니다.) 금붕어, 상어
          상어(자다 - 상어는 잠을 잡니다., 먹다 - 상어는 물고기를 먹습니다.)
  
  ex) 도형은 좌표를 이용해 각 도형의 요소들을 나타낼 수 있지만, 넓이를 구하는 방식은 도형별로 다르다. 
  
 */

package quiz;

interface animals {
	void Sleep ();
	void Eat();
}

interface Pet {
	void play();
}

class LandAnimal {
	void run() {
		System.out.println("육지 동물은 뛸 수 있습니다.");
	}
}

class MarineAnimal {
	void swim() {
		System.out.println("해양 동물은 헤엄 칠 수 있습니다.");
	}
}

class Dog extends LandAnimal implements animals, Pet {
	@Override
	public void Eat() {
		System.out.println("개는 사료를 먹습니다.");
	}
	@Override
	public void Sleep() {
		System.out.println("개는 잠을 잡니다.");
	}
	@Override
	public void play() {
		System.out.println("이 동물은 애완동물이 될 수 있습니다.");
	}
}

class Tiger extends LandAnimal implements animals {
	@Override
	public void Sleep() {
		System.out.println("호랑이는 잠을 잡니다.");
	}
	@Override
	public void Eat() {
		System.out.println("호랑이는 고기를 먹습니다.");
	}
}

class Shark extends MarineAnimal implements animals {
	@Override
	public void Eat() {
		System.out.println("상어는 물고기를 먹습니다.");
	}
	@Override
	public void Sleep() {
		System.out.println("상어는 잠을 잡니다.");
	}
}

class Goldfish extends MarineAnimal implements animals {
	@Override
	public void Eat() {
		System.out.println("금붕어는 플랑크톤을 먹습니다.");
	}
	@Override
	public void Sleep() {
		System.out.println("금붕어는 잠을 잡니다.");
	}
}

public class Quiz3_240318_PM {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Goldfish goldfish = new Goldfish();
		Tiger tiger = new Tiger();
		Shark shark = new Shark();
		dog.run();
		dog.Sleep();
		play(dog);
		shark.swim();
	}
	
	public static void play(Pet pet) {
		pet.play();
	}

}
