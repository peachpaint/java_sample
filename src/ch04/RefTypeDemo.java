package ch04;

public class RefTypeDemo {

	public static void main(String[] args) {
		int i = 10;
		Ball myBall = new Ball();
		Ball yourBall = new Ball();

		System.out.println(myBall);
		System.out.println(yourBall);
		System.out.println(yourBall == myBall);

		myBall = yourBall;

		System.out.println(myBall);
		System.out.println(yourBall);
		System.out.println(yourBall == myBall);

	}

}

class Ball {

}
