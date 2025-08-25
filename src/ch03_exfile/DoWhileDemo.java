package ch03_exfile;

import java.util.Scanner;

public class DoWhileDemo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = -1;
		do {
			System.out.println("값을 입력하세요 : ");
		} while (num > 0);
		System.out.println("종료!");

		// 1~10까지의 홀수만 출력
		int number = 0;// 변수 초기값 지정
		while (number < 10) {// 10까지만 출력
			number++;// 출력할 값을 1씩 증가
			if (number % 2 == 1) { // 변수와 2의 나눗셈의 나머지 값을 나타냄
				System.out.println(number);
			}
		}
	}

}
