package ch07;

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

interface A {
	void method1();

	default void method2() {
	};
}

class D1 implements A {
	@Override
	public void method1() {

	}

	@Override
	public void method2() {

	}
}
