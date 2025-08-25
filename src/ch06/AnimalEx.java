package ch06;

public class AnimalEx {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.eat();

		Eagle eagle = new Eagle();
		eagle.eat();
		eagle.move();
	}

}

class Animal {
	String eye;
	String mouth;

	void eat() {
	}

	void sleep() {

	}

	void move() {
		System.out.println("동물은 움직인다");
	}
}

class Eagle extends Animal {
	String wing;

	@Override
	void move() {
		System.out.println("독수리가 날아갑니다");
	}

	void fly() {

	}
}

class Tigger extends Animal {
	String leg;

//	void run() {
//
//	}
	@Override
	void move() {
		System.out.println("호랑이가 달립니다");
	}
}

class Coldfish extends Animal {
	String fin;

	void swming() {

	}
}
