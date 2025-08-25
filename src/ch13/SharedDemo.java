package ch13;

import java.util.Random;

public class SharedDemo {

	public static void main(String[] args) {

	}

}

class SharedCar {
	public void drive(String name, String where) {
		System.out.println(name + "님이 자돝차에 탔습니다");
		Random r = new Random();
		for (int i = 0; i < r.nextInt(1, 3); i++) {
			System.out.println(name + "님이 자돝차를 운전합니다");
		}
		System.out.println(name + "님이" + where + "자돝차에 탔습니다");
	}
}

class CarThread extends Thread {
	private String Who;
	private SharedCar Car;
	private String Where;

	public CarThread(String who, SharedCar car, String where) {
		this.Who = who;
		this.Car = car;
		this.Where = where;
	}

	@Override
	public void run() {

		super.run();
	}
}
