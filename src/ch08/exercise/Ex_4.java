package ch08.exercise;

import java.util.Random;

public class Ex_4 {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			System.out.println(new Dice(), roll());
		}
	}

}

class Dice {
	int roll() {
		Random r = new Random();
	}
}
