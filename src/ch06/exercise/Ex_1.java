package ch06.exercise;

public class Ex_1 {

	public static void main(String[] args) {
		Circle c = new Circle(10);
		c.show();
		ColoredCircle cc = new ColoredCircle(10, "빨간색");
		cc.show();
	}

}

class Circle {
	int radius;// 필드값

	void show() {
		System.out.println("반지름이 " + radius + "인 원이다");
	}// 메서드 선언

	public Circle(int radius) {
		this.radius = radius;
	}// 메서드 선언
}

class ColoredCircle extends Circle {
	String color;// 필드값

	public ColoredCircle(int radius, String color) {
		super(radius);
		this.color = color;

	}

	@Override
	void show() {
		System.out.println("반지름이 " + radius + "인 " + color + " 원이다");
	}
}
