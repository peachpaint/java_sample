package ch02_exfile;

public class CompLogicDemo {

	public static void main(String[] args) {
		int x = 0, y = 1;//같은 데이터 타입을 대입 할 때는 ,를 이용하여 이어서 작성 가능
		System.out.println(x < y && x == 0);//&&논리 연산자로 and와 같은 취급함 즉 true가 출력
		System.out.println(x > y);
		
		System.out.println(x > y && 5 / 0 == 0);//쇼트서킷으로 &&연산자는 조건식1이 false 이면 조건식2를 진행하지 않고 false만 출력
		System.out.println(x < y || 5 / 0 == 0);// ||는 or과 같은 취급을 받는 논리 연산자로 조건신1이 true면 조건식 2를 진행하지 않고 true 출력 
		System.out.println(x > y || x < y);// ||는 or과 같은 취급을 받는 논리 연산자로 조건신1이 true면 조건식2를 진행하지 않고 true 출력, 조건식2만 맞는 경우도 조건식1을 진행 하지 않고 true만 출력

	}

}
