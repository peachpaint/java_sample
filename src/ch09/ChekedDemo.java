package ch09;

public class ChekedDemo {

	public static void main(String[] args) {
		try {
			Thread.sleep(100);// seconed 단위
		} catch (InterruptedException e) {

			System.out.println("인터럽트 이벤트가 발생함");
		}
	}

}
