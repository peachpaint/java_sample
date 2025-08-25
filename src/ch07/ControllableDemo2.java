package ch07;

public class ControllableDemo2 {

	public static void main(String[] args) {
		Controllable[] controllables = { new Tv(), new Computer(), new Notebook() };

		for (Controllable controllable : controllables) {
			controllable.turnOn();
			controllable.turnOff();
			controllable.repair();

		}
		Controllable.reset();

	}

}
