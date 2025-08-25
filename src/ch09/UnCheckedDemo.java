package ch09;

import java.util.StringTokenizer;

public class UnCheckedDemo {

	public static void main(String[] args) {
//		int res = 5 / 0;//ArithmeticException

		String str = "";// null을 입력시
		System.out.println(str.length());// NullPointer Exception

		int[] arr = new int[0];// null을 입력시 , ""도 안됨
		System.out.println(arr.length);// NullPointer Exception
//		System.out.println(arr[3]);// ArrayIndexOutOfBoundsException

		String s = "a b c";
		StringTokenizer st = new StringTokenizer(s);
		while (st.hasMoreTokens()) {
			st.nextToken();
		}
		st.nextToken();// NoSuchElementException
	}

}
