package ch10;

public class UseThisDemo {

	public static void main(String[] args) {
		new UseThisDemo().lambda();
	}

	public void lambda() {
		String h1 = "Hi";

		UseThis u1 = new UseThis() {
			@Override
			public void use() {
				System.out.println(this);// this =>익명클래스가 자기자신을 의미함
			}
		};
		u1.use();

		UseThis u2 = () -> System.out.println(this);// this => u2를 의미함
		u2.use();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "UseThisDemo";
	}

}

interface UseThis {
	void use();

}