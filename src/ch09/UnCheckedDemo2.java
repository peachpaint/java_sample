package ch09;

public class UnCheckedDemo2 {

	public static void main(String[] args) {
		int number = 1;
		try {
			int res = 5 / number; // ArithmeticException

			String str = null;
			System.out.println(str.length());// NullPointerException

			int[] arr = new int[0];
			System.out.println(arr[3]);// ArrayIndexOutOfBoundsException

		} catch (ArithmeticException e) {
			// e.printStackTrace();
			System.out.println("0으로 나눌 수 없습니다");
		} catch (NullPointerException e) {
			System.out.println("문자열이 같을 수 없습니다");
		} catch (Exception e) {
			System.out.println("알 수 없는 예외가 발생했습니다");// 제일 마지막에 작성
		}
	}

}
