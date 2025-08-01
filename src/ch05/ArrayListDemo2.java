package ch05;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		// 스캐너 객체 할당
		Scanner in = new Scanner(System.in);

		// 동적 배열 선언 : 크기가 유동적인 배열
		ArrayList<Integer> scroes = new ArrayList<>();

		// 표준입력장치에서 원하는 숫자 만큼 점수를 입력 받아서 동적 배열에 저장, 종료하려면 -1 점수를 입력
		int score = 0;
		while (true) {
			// 반복실행문
			System.out.println("학생의 점수를 입력하세요. (종료하려면 -1을 입력) : ");
			score = in.nextInt();
			if (score < 0) {
				break;
			}
//		scores.add(score);
//		}
//		
//		int count =scores.size()
//		//점수가 50점 이하인 학색은 동적배열에서 삭제
//		for (int i = 0; i < count; i++) {
//			if (scores.get(i) <= 50 ) {
//				;
//			} 
//		}

			// 동적 배열에서 크기만큼 점수를 꺼내서 합계를 구하고 평균을 구하라
			int sum = 0;
//		for (int i = 0; i < scores.size(); i++) {
//			sum += scores;
//		}
//		System.out.printf("학생 %d명의 점수 합은 %d 입니다 \n", sum);
//		System.out.printf("학생 %d명의 점수 평균은 %.2f 입니다  ", (sum / (double)));
		}
	}

}
