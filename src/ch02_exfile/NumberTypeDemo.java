package ch02_exfile;

public class NumberTypeDemo {

	public static void main(String[] args) {
		int mach;
		int distance;
		mach = 340;
		distance = 340 * 60 * 60;
		System.out.println("소리가 1시간 도안 가는 거리 : " + distance + "m");
		
		double radius;
		double area;
		radius = 10.0;
		area = radius * radius * 3.14;
		System.out.println("반지름" + radius + "인 원의 넓이는 " + area + "입니다");
		
		char c = 'A';
		c='a';
		c='b';
		System.out.println(c);//마지막에 대입한 것이 출력
		
		final double PI;//final을 넣은 변수선언문은 상수 취급
		PI = 3.14159;
		System.out.println(PI);
		
	}

}
