package ch07.sec06;

public class MemberDemo {

	class Eagle extends Bird {
		@Override
		void move() {
			// override
			System.out.println("독수리가 움직인다");
		}

		void sound() {
			System.out.println("독수리가 삐이익 운다");
		}
	}

	Eagle e = new Eagle();

	public static void main(String[] args) {
		MemberDemo m = new MemberDemo();
		m.e.move();
	}

}
