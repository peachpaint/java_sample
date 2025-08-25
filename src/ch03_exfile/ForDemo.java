package ch03_exfile;

import java.util.Scanner;

public class ForDemo {

	public static void main(String[] args) {
		// for(초기식;조건식;증감식){}
		for (int i = 0; i < 5; i++) {
			System.out.println("hello world, " + (i + 1));
		}

		for (int i = 11; i < 20; i++) {
			System.out.println(i);
		}

		Scanner in = new Scanner(System.in);
		System.out.println("출력하고자 하는 구구단 을 입력하세요 : (2 ~ 19) ");
		int dan = in.nextInt();

		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d \n", dan, i, dan * i);
		}

	}

}
