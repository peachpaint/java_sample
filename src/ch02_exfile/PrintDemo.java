package ch02_exfile;

public class PrintDemo {

	public static void main(String[] args) {
		System.out.println("a");
		System.out.println("b");
		System.out.println("c");
		System.out.println("d");
		
		int x = 10;
		double pi= 3.14;
		System.out.printf("a is %d, pi is %-4.2f \n", x, pi);//정수는 %d에 대입, 실수는 %f로 대입
	}

}
