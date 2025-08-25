package ch08;

import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) {
		Random r = new Random();

		for (int i = 0; i < 10; i++) {
			System.out.println(r.nextLong(1000001L));// 0~100 까지의 수를 랜덤하게 10개를 출력
		}

	}

}
