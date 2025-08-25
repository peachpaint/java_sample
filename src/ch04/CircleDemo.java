package ch04;

public class CircleDemo {

	public static void main(String[] args) {
//		Circle c = new Circle();

//		c.setRedius(10);
//		System.out.println(c.radius);
//		System.out.println("원의 반지름는" + c.getRadius());
//		System.out.println("원의 반지름는" + c.findArea());

		Circle c1 = new Circle(2);
		System.out.println("원의 반지름는" + c1.getRadius());
		System.out.println("원의 반지름는" + c1.findArea());

	}

}

//class Circle {
//	double radius; // 0.0자동 값 생성
//
//	double findArea() {
//		return 3.14 * this.radius * radius;
//	}
//}

class Circle {
	// 멤버-필드
	private double radius;// 캡슐화

	// 생성자
	public Circle(double radius) {
		if (radius > 0) {
			this.radius = radius;
		}
	}

	// Getter
	public double getRadius() {
		return radius;

	}

	// Setter
	public void setRadius(double r) {
		if (r <= 0) {
			System.out.println("원의 반지름은 0 보다 커야 됩니다.");
		}
		this.radius = r;
	}

	public double findArea() {
		return 3.14 * this.radius * radius;
	}
}
