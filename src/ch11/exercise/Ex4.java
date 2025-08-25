package ch11.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> scores = new ArrayList<>();
		int score = 0;
		while (true) {
			System.out.println("점수를 입력하세요 : ");
			try {
				score = Integer.parseInt(in.nextLine());
				if (score < 0) {
					break;
				} else {
					scores.add(score);
				}
			} catch (NumberFormatException e) {
				System.out.print("입력 오류 ==> 숫자를 입력하세요 , ");
				continue;
			}
		}
		Collections.sort(scores, Collections.reverseOrder());
		int max = scores.get(0);
		String grade = "";
		for (Integer sc : scores) {
			if (sc > max - 10) {
				grade = "A";
			} else if (sc > max - 20) {
				grade = "B";
			} else {
				grade = "C";
			}
			System.out.println(sc + " : " + grade);
		}
	}
}
