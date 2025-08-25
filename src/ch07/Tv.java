package ch07;

public class Tv implements Controllable, RemoteControllable {
	@Override
	public void turnOn() {
		System.out.println("tv를 켠다");
	}

	@Override
	public void turnOff() {
		System.out.println("tv를 끈다");
	}

	@Override
	public void remoteOn() {
		System.out.println("리모트콘으로 tv를 끈다");
	}

	@Override
	public void remoteOff() {
		System.out.println("리모트콘으로 tv를 끈다");
	}

}

class Computer implements Controllable {
	@Override
	public void turnOn() {
		System.out.println("컴퓨터를 켠다");
	}

	@Override
	public void turnOff() {
		System.out.println("컴퓨터를 끈다");

	}
}

class Notebook extends Computer implements Portable {
	@Override
	public void inMyBag() {
		System.out.println("노트북을 가방에서 꺼낸다");
	}

	@Override
	public void turnOn() {
		System.out.println("노트북을 켠다");
	}

	@Override
	public void turnOff() {
		System.out.println("노트북를 끈다");
	}
}
