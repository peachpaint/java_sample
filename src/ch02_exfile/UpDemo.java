package ch02_exfile;

public class UpDemo {

	public static void main(String[] args) {
		int j, i = 3;
		j = ++i;// ++는 전위 연산자, 연산전 값이 증가->3+1=4
		i = i + 1;// ->4+1 =5
		System.out.printf("%d, %d", j, i);
	}

}
