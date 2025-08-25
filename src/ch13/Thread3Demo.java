package ch13;

public class Thread3Demo {
	// Runnable 인터페이스의 구현체(Thread)를 상송받는 WorkerThread 를 따로 작성하고 이를 활용
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

class WorkerThread extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
	}
}
