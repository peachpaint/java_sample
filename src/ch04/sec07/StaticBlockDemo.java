package ch04.sec07;

public class StaticBlockDemo {
	// 정적 변수
	static int sumOneToTen;
	static {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += 1;
		}
		sumOneToTen = sum;
	}
	int any = 0;

	// 정적 메서드
	public static void main(String[] args) {
		System.out.println(sumOneToTen);// 클래서 매서드에서 클래스 변수만 사용 가능(인스턴스, 지역변수 사용 불가)
//		System.out.println(any); 

	}

}
