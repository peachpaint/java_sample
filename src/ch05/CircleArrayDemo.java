package ch05;

public class CircleArrayDemo {

	public static void main(String[] args) {
		Circle[] circles = new Circle[5];

		for (int i = 0; i < circles.length; i++) {
			circles[i] = new Circle(i + 1.0);
//			System.out.printf("원의 넓이(반지름 : %f) = %2f \n", circles[i].radius, circles[i].findArea());
		}
	}

}

class Circle {
	double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

//	public double findArea() {
//		retrun 3.14 * radius * radius;
//	}
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return String.format("원의 넓이(반지름 : %f) = %2f \n", circles[i].radius, circles[i].findArea());
//	}

}