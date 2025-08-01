package ch03;

import java.util.Scanner;

public class ForDemo {

	public static void main(String[] args) {

//		for(초기식 ; 조건식 ; 증감식) {
		for (int i = 0; i < 3; i++) { // i ++ ==> i + ==> i = i + 1
			System.out.println("hello world" + (i + 1));
		}
//		1부터 10까지 정수를 출력 / 10부터 1까지 정수 출력 / 11부터 20까지
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
		for (int i = 11; i <= 20; i++) {
			System.out.println(i);
		}
//		구구단 2단 반복문
		for (int i = 2; i <= 9; i++) {
			System.out.printf("%d * %d = %d \n", 2, i, 2 * i);
		}
		// scanner 를 선언한다
		Scanner in = new Scanner(System.in);
		// 구구단를 입력하라는 출력문을 실행한다
		System.out.println("구구단를 입력하세요 : (2~19) ");
		// 입력 받는다
		int dan = in.nextInt();
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d \n", dan, i, dan * i);

		}

	}
}
