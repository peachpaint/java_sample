package ch13;

public class InterruptDemo {

	public static void main(String[] args) {
		Runnable task = () -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("안녕");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
			}

		};

		Thread thread = new Thread(task);

		for (int i = 0; i < 5; i++) {
			System.out.println("hello");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}

	}

}
