package ch07;

public class AnimalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		Cukoo c = new Cukoo();

		makeSound(d);
		makeSound(c);
	}

	private static void makeSound(Animal a) {
		a.sound();
	}

}

interface Animal {
	void sound();
}

class Dog implements Animal {

	@Override
	public void sound() {
		System.out.println("멍멍");

	}

}

class Cukoo implements Animal {

	@Override
	public void sound() {
		System.out.println("삐곡");

	}

}