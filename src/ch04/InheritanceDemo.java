package ch04;

public class InheritanceDemo {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.move();
		Tiger tiger = new Tiger();
		tiger.eat();
		tiger.move();
		Bird bird = new Bird();
		bird.move();
		Fish fish = new Fish();
		fish.move();
	}

}

class Animal {
	// 주둥이
	String mouth;

	// eat()
	void eat() {
		System.out.println("먹습니다");
	}

	// move()
	void move() {
		System.out.println("움직입니다");
	}
}

class Tiger extends Animal {
	// 주둥이
	// eat()
	// move()
}

class Fish extends Animal {
	// 주둥이
	// eat()
	// move()
	@Override
	void move() {
		System.out.println("헤엄칩니다");
	}
	// 헤엄치다()
//	void swim() {
//		System.out.println("헤엄칩니다");
//	}
}

class Bird extends Animal {
	// 주둥이
	// eat()
	// move()
	@Override
	void move() {
		System.out.println("날아갑니다");
	}
	// fly()
//	void fly() {
//		System.out.println("날아갑니다");
//	}
}
