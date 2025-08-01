package ch04.sec07;

import java.util.Scanner;

public class DiceDemo2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("반복수행 횟수를 입력하세요 : ");
		int count = in.nextInt();
		Dice dice = new Dice();

		for (int i = 0; i < count; i++) {
			dice.roll();
		}
	}

}

//class Dice {
//	void roll() {
//		System.out.println((int) (Math.random() * 6) + 1);
//
//	}
//
//}
