package ch07.sec06;

public class AnonymousDemo {

	// 이름없는 객체 생성
	Bird b = new Bird() {
		@Override
		void move() {
			System.out.println("이름 없는 새가 날아간다");
		};

		// 익명 클래스에 작성했기 때문에 부모메소드에 작성된 것만 사용 가능
		void sound() {
			System.out.println("독수리가 삐이익 운다");
		}

	};

	public static void main(String[] args) {
		AnonymousDemo a = new AnonymousDemo();
		a.b.move();
	}

}
