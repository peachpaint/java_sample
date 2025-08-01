package ch02;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		char c = '';  빈문자는 안됨
		String s = ""; // 빈 문자열은 가능
		String res = "\\" + 7 + 7; // 문자열 "77"
		String res1 = 7 + 7 + ""; // 문자열 "14"

		System.out.println(res);
		System.out.println(res1);
	}

}
