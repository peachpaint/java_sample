package ch05.Enum;

import java.util.Arrays;

public class MathRandom {
	// 다이스문서
	public static void main(String[] args) {
		Stiring[] name = { "가위", "바위 ", "보" };

		System.out.println(name);
		System.out.println(Arrays.toString(name));

		for (int i = 0; i < 10; i++) {
			System.out.println((Math.random()));
		}

	}

}
