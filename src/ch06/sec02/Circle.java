package ch06.sec02;

public class Circle {
	private void secret() {
		System.out.println();
	}

	public static void main(String[] args) {
		System.out.println("비밀");
	}

	protected void findRadius() {
		System.out.println("반지름 10.0");
	}

	public void findArea() {
		System.out.println("넓이는 Pi*반지름*반지름");
	}

}
