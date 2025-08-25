package ch10;

public class LambdaDemo {

	public static void main(String[] args) {
//		(a, b) -> a> b ? a: b ;
//		Object obj = new Object() {
//			int max(int a, int b) {
//				return a > b ? a : b;
//			}
//		};
//
//		int value = obj.max(2, 3);

//		MyFunction f = new MyFunction() {
//			// 익명 클래스
//			@Override
//			public int max(int a, int b) {
//				return a > b ? a : b;
//			};
//		};
		// 위의 것 축약
		MyFunction f = (a, b) -> a > b ? a : b;

		int value = f.max(3, 5);
		System.out.println("최대값은 " + value);

		PrintFunction pf = (name, i) -> System.out.println(name + "-" + i);

		pf.printVar("hello", 3);

		SquareFunction sf = (int x) -> x * x;
		System.out.println(sf.square(3));

		RollFunction rf = () -> (int) (Math.random() * 6) + 1;

		for (int i = 0; i < 10; i++) {
			System.out.println(rf.roll());
		}

		YourFunction yf = (a, b) -> a < b ? a : b;
		System.out.println("최소값은 " + yf.min(3, 5));
	}

}

@FunctionalInterface
interface MyFunction {
	int max(int a, int b);
}

@FunctionalInterface
interface PrintFunction {
	void printVar(String name, int i);
}

@FunctionalInterface
interface SquareFunction {
	int square(int x);
}

@FunctionalInterface
interface RollFunction {
	int roll();
}

@FunctionalInterface
interface YourFunction {
	int min(int a, int b);
}
