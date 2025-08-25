package ch09.exercise;

public class Ex01 {

	public static void main(String[] args) {
		Box<Integer> i = new Box<>();
		i.set(Integer.valueOf(100));
		System.out.println(i.get());

		Box<String> s = new Box<>();
		s.set("만능이네!");
		System.out.println(s.get());
	}

}

class Box<B> {
	private B box;

	public B get() {
		return box;
	}

	public void set(B box) {
		this.box = box;
	}
}
