package ch02_exfile;

public class TypeCastingDemo {

	public static void main(String[] args) {
		double d1 = 5 * 3.14;// 5->5.0 자동 타입 변환됨
		double d2 = 1;
		double d = 3.14f + 1;
		System.out.println(d1 + "과" + d2);

		// 강제 형변환 -> 값손실 발생
		float f = (float) 3.14;// 3.14f
		byte b = (byte) 300;
		System.out.println(f + "," + b + "," + d);

		// 숫자->문자, 문자->숫자
		char c = 3 + '0'; // '0' : 48(유니코드)
		int i = '3' - '0';// '3' : 51 -> 51-48=3
		System.out.println("문자 c :" + c + "," + i);

		// 숫자->문자열, 문자열->숫자
		String s = 3 + "";
		String s1 = '3' + "";
		System.out.println("문자열 s : " + s + "," + s1);

		// 문자열->문자
		System.out.println(s1.charAt(0));
		System.out.println("hello".charAt(1));// ""안의 글자 순번을 charAt(a)의 a값에 적으면 그 글자가 출력됨
		System.out.println("안녕하세요".charAt(1));// charAt(0)->첫자리,charAt(1)->두째자리

		// 문자열->숫자
		String str = "300";
		int valuel = Integer.parseInt(str);// 문자열->정수타입(int)로 변환
		System.out.println(valuel + 1);

	}

}
