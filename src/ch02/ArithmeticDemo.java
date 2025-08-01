package ch02;

public class ArithmeticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long l = 100;
		int i = 10;

		long result = l + i;
		System.out.printf("%d 와 %d 의 + 연산결과 %d 입니다. \n", l, i, result);

		double d = 100.0;
		int i1 = 10;

		double result1 = d + i;
		System.out.printf("%f 와 %d 의 + 연산결과 %f 입니다. \n", d, i1, result1);

		int a = 1_000_000;
		int b = 2_000_000;

		long res = (long) a * b;
		System.out.println(res);

		int apple = 1;
		double pieceUnit = 0.1f;
		int number = 7;

		double result2 = apple - pieceUnit * number;
		System.out.println(result2);

		// 나누기와 나머지 연산 (0, 0.0 나누거나 나머지 연산에 주의)

		int zero = 0;
		double zero1 = 0.0;
//		int res3 = 5 / zero;
		System.out.println(5 / zero1);
		System.out.println(5 % zero1);

		int res3 = 4 / 3;
		double res6 = 4 / (double) 3;
		System.out.println(res3);
		System.out.println(res6);

		// 짝수 홀수 %연산

		int three = 3;
		int res4 = three % 2;
		System.out.println(res4);

		int four = 4;
		int res5 = four % 2;
		System.out.println(res5);
	}

}
