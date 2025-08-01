package ch03;

import java.util.Scanner;

public class MultiIfDemo {

	public static void main(String[] args) {
		// scanner 를 선언한다
		Scanner in = new Scanner(System.in);
		// 정수를 입력하라는 출력문을 실행한다
		System.out.println("점수를 입력하세요 : (1 ~ 100) ");
		// 정수를 입력 받는다
		int score = in.nextInt();
		String grade;
		// 다중 if 문으로 입력받은 정수의 학점을 계산한다
		if (score >= 90) {
			grade = "A";
		} else if (score >= 80) {
			grade = "B";
		} else if (score >= 70) {
			grade = "C";
		} else {
			grade = "F";

		}
		// 학적음 출력한다
		System.out.println("당신의 학점은" + grade + "입니다");
	}

}
