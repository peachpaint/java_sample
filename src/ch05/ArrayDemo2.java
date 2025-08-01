package ch05;

import java.util.Scanner;

public class ArrayDemo2 {

	public static void main(String[] args) {
		// 스캐너 객체 할당
		Scanner in = new Scanner(System.in);

		// 배열 선언 : 크기 100이고 정수를 담고 있는 배열
		int[] scores = new int[100];

		// 표준입력장치에서 원하는 점수를 입력 받아서 배열에 저장, 종료하려면 -점수를 입력
		// 입력받은 학생이 몇명인지 count
		int count = 0;
		int score = 0;
		while (true) {
			// 반복실행문
			System.out.println("학생의 점수를 입력하세요. (종료하려면 -1을 입력) : ");
			score = in.nextInt();
			if (score < 0) {
				break;
			}
			scores[count++] = score;
		}

		// 배열에서 count한 학생 수만큼 점수를 꺼내서 합계를 구하고 평균을 구하라
		int sum = 0;
		for (int i = 0; i < count; i++) {
			sum += scores[i];
		}
		System.out.printf("학생 %d명의 점수 합은 %d 입니다 \n", count, sum);
		System.out.printf("학생 %d명의 점수 평균은 %.2f 입니다  ", count, (sum / (double) count));

	}

}
