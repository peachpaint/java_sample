package ch02_exfile;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//		System.out.println("입력하세요");
//		int x = in.nextInt();//in.nextInt는 정수값만 입력 받겠다는 것
//		System.out.printf("%d 입니다 \n", x);
//		
//		System.out.println("입력하세요");
//		float f = in.nextFloat();//in.nextFloat는 실수값만 입력 받겠다는 것
//		System.out.printf("%f 입니다",f);
		
		System.out.println("입력하세요");
		String s = in.nextLine();//Scanner(System.in)으로 키보드로 입력값을 밭은 것이 s라고 선언함
		System.out.printf("%s 입니다",s);
		int number = Integer.parseInt(s);//s를 정수(int)로 변환하는 메서드입니다. 
		//즉, 문자열로 표현된 숫자를 실제 연산 가능한 정수 값으로 바꾸는 역할 
		System.out.printf("s + 10 은 %d 입니다", number + 10);
		
		System.out.println("실수 값을 입력하세요 : ");
		s= in.nextLine();
		System.out.printf("당신이 입력한 값은 %s 입니다.\n", s);
		double number1 = Double.parseDouble(s);
		System.out.printf("s + 10 은 %f 입니다. \n", number1 + 10);
		
	}

}
