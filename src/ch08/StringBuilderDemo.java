package ch08;

public class StringBuilderDemo {

	public static void main(String[] args) {
		String s = "hi";// stact에 저장
		String ss = "hello";

		s = s + "!";// 새로운 것으로 변수값 추가데이터 저장

		System.out.println(s.hashCode());
		System.out.println(ss.hashCode());

		String s1 = new String("hello");// 객체를 새로 생성하여 호출
		String s2 = new String("hello");// 객체를 새로 생성하여 호출
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

		StringBuilder sb = new StringBuilder("hello, world");
		System.out.println(sb.hashCode());

		sb.append("!");
		System.out.println(sb.hashCode());

		sb.replace(7, 12, "java");
		System.out.println(sb);
	}

}
