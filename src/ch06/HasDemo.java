package ch06;

public class HasDemo {

//	public static void main(String[] args) {
//		Engine e = new Engine();
//		Engine e2 = new Engine();
//		Car c = new Car(e);
////		c.engin = e;
//		c.setEngine(e2);
//	}

}

class Engine {

}

class Car {
	private Engine engine;

	// 생성자 -> 생성시 부품을 주입 ->생성자 주입
//	public Car() {
//		this.engine = new Engine;
//	}

	public Engine getEngin() {
		return engine;
	}

	// 설정자(setter) -> -> 설정자 주입
//	public void setEngine(Engine engine) {
//		this.engine = engine;
//	}
}
