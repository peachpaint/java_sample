package ch09;

public class Genericmethod1 {

	public static void main(String[] args) {
		Integer[] iArr = { 1, 2, 3, 4, 5 };
		String[] sArr = { "a", "b", "c" };

		test(iArr);
		System.out.println(getLast(iArr));
		getLast(sArr);
		System.out.println(getLast(sArr));

	}// genericmethod가 아님

	public static <T> void test(T[] arr) {// <T> 제네릭 메서드라는 표시
		for (T t : arr) {
			System.out.println(t);
		}
	}

	public static <T> T getLast(T[] arr) {
		return arr[arr.length - 1];
	}

}
