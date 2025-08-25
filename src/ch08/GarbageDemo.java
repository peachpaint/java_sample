package ch08;

public class GarbageDemo {

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			new Garbage(i);
		}
	}

}

class Garbage {
	// field
	int no;

	// 생산자
	public Garbage(int no) {
		this.no = no;
		System.out.printf("Garbage (%d) 생성 \n", no);

	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
}