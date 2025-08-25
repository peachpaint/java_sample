package ch06.sec02;

public class Ball extends Circle {
	private String color;

	public void Ball() {
		this.color = color;
	}

	public void findColor(String color) {
		System.out.println(color + "공이다");
	}

	public void findVolume() {
		System.out.println("공의 부피 4/3 *(Pi*반지름*반지름) ");
	}

}
