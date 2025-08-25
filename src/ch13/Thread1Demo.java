package ch13;

public class Thread1Demo {
//Thread 익명 객체를 작성하고 활용
	public static void main(String[] args) {
		new Thread() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + "thead ==>");
				System.out.println("안녕");
			}
		}.start();

		System.out.println(Thread.currentThread().getName() + "thead ==>");
		System.out.println("hello");
	}

}
