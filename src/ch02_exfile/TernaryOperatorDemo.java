package ch02_exfile;

public class TernaryOperatorDemo {

	public static void main(String[] args) {
		int x = 1, y;
		y = (x== 1) ? 10 : (5 / 0);//==가 참이면-> ? 10, 거짓이면 ->: (5/0)의 값을 출력
		System.out.println(y);
		
		int a, b, c;
		a = b = c = 3;
		
		c= a * b / c * 2;//c 에 대한 변수값을 다시 지정
		System.out.println(c);
		
		c = a++ + --b * a;
		//a++는 후위 연산자로 연산이 전개된것이 없음-> a++=3,
		//--b는 전위 연산자로 연산 전개전 숫자가 감소함 -> b--=2,
		//a는 앞에 a++(후위증가연산자)로 선언되어 값이 증가됨 -> a=4
		System.out.println(c);
		//연산순서는 1번 --b=2, a=4 -> 2*4=8
		//2번 ++a=3 -> 3+8=11
	}

}
