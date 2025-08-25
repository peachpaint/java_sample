package ch02_exfile;

public class StringDemo {

	public static void main(String[] args) {
//		char c='' ->빈 문자는 안됨!
		String s = "";//빈 문자열은 가능
		String res = "\t" + 7 + 7 ; // \t->1번 탭하여 출격, 연산 순서에 따라 처음부터 문자열로 인식함
		System.out.println(res);//77로 출려 -> 7과 7을 각각의 문자로 인식
		String res1 = 7 + 7 + ""; // ->연산 순서에 따라 7+7=14가 되고 ""는 문장열고 인식하여 
		System.out.println(res1); // 문자열 "14"로 출력
	}

}
