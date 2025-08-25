package ch03;

public class WhileDemo {

	public static void main(String[] args) {
		// 밑의 반복문의 횟수를 한 번에 변경 할 수 있는 프로그램 수정
		int count = 5;
//		 초기식
		int i = 0;
		while (i < count) {
			// 반복실행문
			System.out.println("infinite-loop" + i);
			// 증감식
			i++;
		}
		for (int j = 0; j < count; j++) {
			System.out.println("loop" + j);
		}

		int k = 0;
		while (true) {
			// 반복실행문
			System.out.println("loop" + k);
			k++;
			if (k >= count) {
				break;
			}
		}

	}

}
