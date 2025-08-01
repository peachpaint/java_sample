package ch03;

public class IncrementDemo2 {

	public static void main(String[] args) {
		RefValue ref = new RefValue();
		ref.x = 10;
		System.out.println("main 에서 incriment 호출하기 전 : " + ref.x);
		incriment(ref);
		System.out.println("main 에서 incriment 호출 후 : " + ref.x);
	}

	public static void incriment(RefValue r) {
		System.out.println("incriment 메서드 시작 : " + r.x);
		r.x = 1000;
		System.out.println("incriment 메서드 종료 : " + r.x);
	}

}

class RefValue {
	int x;
}
