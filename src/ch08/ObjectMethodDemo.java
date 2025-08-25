package ch08;

import java.util.Objects;

public class ObjectMethodDemo {

	public static void main(String[] args) {
		Mouse m1 = new Mouse("Logitech", 35000);
		Mouse m2 = new Mouse("Logitech", 25000);
		Mouse m3 = m1;

		Keyboard k1 = new Keyboard("Microshft", 58000);
		Keyboard k2 = new Keyboard("Microshft", 60000);

		System.out.println(m1.toString());
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);

		System.out.println(k1.toString());
		System.out.println(k1);
		System.out.println(k2);

		System.out.println(m1.equals(m2));
		System.out.println(m1.equals(m3));
		System.out.println(k1.equals(k2));
	}

}

class Mouse {
	String name;
	int price;

	public Mouse(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj instanceof Mouse m) {

			return this.hashCode() == m.hashCode();

		}
		return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(name, price);
	}
}

class Keyboard {
	String name;
	int price;

	public Keyboard(String keyboard) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj instanceof Mouse m) {

			return this.hashCode() == m.hashCode();

		}
		return false;
//		if (obj instanceof Keyboard k) {
//			if (name.equals(k.name)) {
//				return true;
//			}
//		}
//		return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(name, price);
	}
}
