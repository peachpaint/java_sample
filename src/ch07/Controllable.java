package ch07;

public interface Controllable {
	void turnOn();

	void turnOff();

	default void repair() {
		System.out.println("수리한다");
	}

	private void show(String s) {
		System.out.println(s);
	}

	static void reset() {
		System.out.println("장비를 초기화한다.");
	}
}

interface Portable {
	void inMyBag();
}