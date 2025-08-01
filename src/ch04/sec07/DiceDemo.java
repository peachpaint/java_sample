package ch04.sec07;

public class DiceDemo {

	public static void main(String[] args) {
		Dice dice = new Dice();
		dice.roll();
	}

}

class Dice {
	void roll() {
		System.out.println((int) (Math.random() * 6) + 1);

	}

}
