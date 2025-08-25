package ch07;

public class ControllableDemo {

	public static void main(String[] args) {
		Tv tv = new Tv();

		tv.turnOn();
		tv.turnOff();
		tv.repair();
		tv.remoteOn();
		tv.remoteOff();

		Computer computer = new Computer();

		computer.turnOn();
		computer.turnOff();
		computer.repair();

		Controllable.reset();

		Notebook nb = new Notebook();

		nb.inMyBag();
		nb.turnOn();
		nb.turnOff();

	}

}
