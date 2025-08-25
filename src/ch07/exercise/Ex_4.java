package ch07.exercise;

public class Ex_4 {
	static void speak(Talkable talkable) {
		talkable.talk();
	}

	public static void main(String[] args) {
		speak(new Korea());
		speak(new American());
	}

}

interface Talkable {
	void talk();
}

class Korea implements Talkable {

	@Override
	public void talk() {
		System.out.println("안녕하세요");
	}

}

class American implements Talkable {

	@Override
	public void talk() {
		System.out.println("hello");

	}

}