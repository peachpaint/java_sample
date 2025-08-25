package ch13;

public class Thread2Demo {
	// Runnable 인터페이스를 익명 구현 객체로 활용
	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + "thead ==>");
				System.out.println("안녕");
			}
		});
		thread.start();

		System.out.println(Thread.currentThread().getName() + "thead ==>");
		System.out.println("hello");
	}

}
