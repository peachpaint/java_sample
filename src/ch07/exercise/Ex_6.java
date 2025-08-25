package ch07.exercise;

public class Ex_6 {

	public static void main(String[] args) {
		Worker w = new Worker();
		w.eat();

		Students s = new Students();
		s.eat();
		s.print();

		Human.echo();
	}

}

interface Human {
	void eat();

	default void print() {
		System.out.println("인간입니다");
	}

	static void echo() {
		System.out.println("야호!");
	}
}

//수정X
class Worker implements Human {

	@Override
	public void eat() {
		System.out.println("빵을 먹습니다");

	}

}

class Students implements Human {
	int age;

	@Override
	public void eat() {
		System.out.println("도시락을 먹습니다.");
	}

}