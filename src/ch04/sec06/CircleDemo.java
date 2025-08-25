package ch04.sec06;

public class CircleDemo {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.info();// 생성자 선언 및 호출
		Circle c2 = new Circle(10.0);
		c2.info();
		Circle c3 = new Circle("빨강");
		c3.info();
		Circle c4 = new Circle(10.0, "파랑");
		c4.info();

	}

}

class Circle {
	double radius;// 필드
	String color;// 변수선언 , 필드

	public Circle() {
		this(1.0, "노랑");// 생성자를 다른 코드 보다 가장먼저 입력해야 함
		this.radius = 1.0;
		this.color = "노량";

	}//

	public Circle(double radius) {
//		this.radius = radius;
		this(radius, "노랑");
	}

	public Circle(String color) {
//		this.color = color;
		this(1.0, color);
	}

	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}

	public void info() {
		System.out.printf("원의 반지름은 %.1f 이고 색깔은 %s \n", radius, color);
	}
}
