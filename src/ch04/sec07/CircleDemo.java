package ch04.sec07;

public class CircleDemo {

	public static void main(String[] args) {
		System.out.println(Circle.numOfcircles);

		Circle c1 = new Circle(10.0);
		System.out.println(Circle.numOfcircles);
		System.out.println(c1.numOfcircles);
		System.out.println(c1.numCircles);

		Circle c2 = new Circle(5.0);
		System.out.println(Circle.numOfcircles);
		System.out.println(c2.numOfcircles);
		System.out.println(c2.numCircles);
	}

}

class Circle {
	// 인스턴스 변수
	double radius;
	int numCircles;

	// 정적(static,클래스) 변수
	static int numOfcircles = 0;

	// 생성자
	public Circle(double radius) {
		this.radius = radius;
		numCircles++;
		numOfcircles++;
	}
}
