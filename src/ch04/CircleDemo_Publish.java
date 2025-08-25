package ch04;

public class CircleDemo_Publish {

	public static void main(String[] args) {

		Circle1 c1 = new Circle1(2);
		System.out.println("원의 반지름는 " + c1.getRadius() + " 입니다");
		System.out.println("원의 반지름는 " + c1.findArea() + " 입니다");

	}

}

class Circle1 {
	// 멤버-필드
	private double radius;// 캡슐화

	// 생성자
	public Circle1(double radius) {
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
