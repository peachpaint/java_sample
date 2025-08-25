package ch03_exfile;

import java.util.Scanner;

public class ConditionDemo {

	public static void main(String[] args) {
		int x = 10;
		String str = "NO";

		if (str.equalsIgnoreCase("yes")) {
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			System.out.println(4);
		}

		Scanner in = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		int num = in.nextInt();
		if (num % 2 == 0) { // %->나머지 연산식
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
		System.out.println("종료!!");
	}

}
