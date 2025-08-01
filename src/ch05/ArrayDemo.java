package ch05;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		// 스캐너 객체 할당
		Scanner in = new Scanner(System.in);

		// 배열 선언 : 크기 5이고 정수를 담고 있는 배열
		int[] scores = new int[5];

		// 표준입력장치에서 5번 점수를 입력 받아서 배열에 저장
		System.out.println("학생 5명의 점수를 입력하세요 : ");
		for (int i = 0; i < 5; i++) {
			scores[i] = in.nextInt();
		}

		// 배열에서 5번 점수를 꺼내서 합계를, 구하고 평균을 구하라
		int sum = 0;
		for (int score : scores) {
			sum += score;
		}
		System.out.printf("학생 %d명의 점수 합은 %d 입니다 \n", scores.length, sum);
		System.out.printf("학생 %d명의 점수 평균은 %.2f 입니다  ", scores.length, (sum / (double) scores.length));
	}

}
