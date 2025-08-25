package ch03;

public class NestedIfDemo {

	public static void main(String[] args) {
		// nested if
//		String str = null;//str ->선언만 하고 변수 값 초기화를 하지않으면 실행안됨, 변수값이 없다는 것은 null작성->주소도 없음
		String str = "as";// ""
		System.out.println(str);

//		if (str != null) {// != -> -가 아닐경우
//			if (str.length() == 0) {
//				System.out.println("빈 문자입니다");
//			} else {
//
//			}
//		}

		if (str != null && str.length() > 0) {
			System.out.println(str.length() + " 문자입니다");
		} else {
			System.out.println("빈 문자입니다");
		}
	}

}
