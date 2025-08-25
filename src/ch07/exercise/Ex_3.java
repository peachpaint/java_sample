package ch07.exercise;

public class Ex_3 {

	public static void main(String[] args) {
		Concreate c = new Concreate();
	}

}

abstract class Abstract {
	int i;

	abstract void show();

	public Abstract(int i) {
		this.i = i;

	}
}

class Concreate extends Abstract {
	int j;

	@Override
	void show() {

	}

	public Concreate(int i, int j) {
		super(i);
		this.j = j;
	}
}