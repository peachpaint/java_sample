package ch03;

import java.util.Scanner;

public class MultiIfDemo2 {

	public static void main(String[] args) { //중첩 <- 다중 if 문, 쇼트서킷 
		// scanner 를 선언한다
		Scanner in = new Scanner(System.in);
		// 정수를 입력하라는 출력문을 실행한다
		System.out.println("점수를 입력하세요 : (1 ~ 100) ");
		// 정수를 입력 받는다
		int score = in.nextInt();
		String grade;
		// 다중 if 문으로 입력받은 정수의 학점을 계산한다
		if (score >= 70 && score < 80) {
			//if 문 안에 if 문을 작성 
			if(score >= 70 && score <= 75) {
				grade = "C0";
			} else {
				grade = "C+";
			}
		} else if (score >= 80 && score < 90) {//조건문은 조건을 모두 적느게 좋음
			//if 문 안에 if 문을 작성 
			if(score >= 80 && score <= 85) {
				grade = "B0";
			} else {
				grade = "B+";
			}
		} else if (score >= 90 && score <= 100) {
			//if 문 안에 if 문을 작성 
			if(score >= 90 && score <= 95)
				grade = "A0";
			else 
				grade = "A+";//{}를 생략 할 경우 가장 위치가 가까운 if 문에 대한 else로 실행 시킴-->오류 방지를 위해 {}모두 작성 필요
			
		} else {
			grade = "F";

		}
		// 학적음 출력한다
		System.out.println("당신의 학점은" + grade + "입니다");
		

	}

}
