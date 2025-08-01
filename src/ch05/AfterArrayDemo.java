package ch05;

import java.util.Arrays;

public class AfterArrayDemo {

	public static void main(String[] args) {
		// 방법1 -> int[] scores = { 92, 100, 85, 78, 69 };
		// 방법2 -> int[] scores = new int[]{ 92, 100, 85, 78, 69 };
		// 방법3
//		-> int[] scores;
//		int[] =  new int[]{ 92, 100, 85, 78, 69 };
		// 방법4, 초기화하는 값이 동일한 경우
		int[] scores = new int[5];
		for (int i = 0; i < scores.length; i++) {
			scores[i] = 100;

		}

		int sum = 0;
		for (int i = 0; i < 5; i++) {
			sum = sum + scores[i];

		}
		System.out.printf("학생 %d명의 점수 합은 %d 입니다 \n", scores.length, sum);
		System.out.printf("학생 %d명의 점수 평균은 %.2f 입니다  ", scores.length, (sum / (double) scores.length));

		// 배열의 출력
		int[] arr = { 1, 2, 3, 4, 5 };
		String str = "hello";
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(str);

		char[] cArr = { 'a', 'b', 'c' };
		System.out.println(cArr);

		double[] dArr = { 10.0, 20.0, 30.0 };
		System.out.println(dArr);
		System.out.println(Arrays.toString(dArr));
	}

}
