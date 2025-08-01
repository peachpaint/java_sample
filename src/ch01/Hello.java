package ch01;

public class Hello {
	/*
	 * 프로그램의 기본 메소드
	 * 
	 * @param args 문자 배열
	 */
	public static void main(String[] args) {
//		나의 첫번째 프로그램
		System.out.println("안녕!");// 여기도 주석
		System.out.println("안녕!");
		/*
		 * 여러줄 주석
		 */
		int x;
		x = 1;
		int y = 2;
		int result = x + y;
		System.out.println(result);

		System.out.println("안녕");
		System.out.println("heloo" + "world");
		String str = "hello";
		System.out.println(str);
	}

}
