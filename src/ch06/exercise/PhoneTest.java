package ch06.exercise;

public class PhoneTest {

	public static void main(String[] args) {
		Phone[] phones = { new Phone("황진이"), new Telephone("길동이", "내일"), new Smartphone("민국이", "갤러그") };

		for (Phone phone : phones) {// 구체적인 것 부터 칠문
			if (phone instanceof Smartphone s) {
				s.palyGame();
			} else if (phone instanceof Telephone t) {
				t.autoAnswering();
			} else {
				phone.talk();
			}
		}
	}

}

class Phone {
	protected String owner;

	public Phone(String owner) {
		this.owner = owner;
	}// 생성자 작성

	void talk() {
		System.out.println(owner + "가 통화중");
	}
}

class Telephone extends Phone {
	private String when;

	public String getWhen() {
		return this.when;
	}// 접근자

	public Telephone(String owner, String when) {
		super(owner);
		this.when = when;
	}// 생성자

	void autoAnswering() {
		System.out.println(owner + "가 부재중이니 " + when + "에 전화 요망");
	}
}

class Smartphone extends Telephone {
	private String game;

	// 접근자
	public String getGame() {
		return game;
	}

	// 생성자
	public Smartphone(String owner, String game) {
		super(owner, null);
		this.game = game;
	}

	void palyGame() {
		System.out.println(owner + "가 게임중");
	}
}