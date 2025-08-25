package ch07.exercise;

public class Ex_5 {

	public static void main(String[] args) {
		Controller[] c = { new Tv(false), new Radio(true) };
		for (Controller controller : c) {
			controller.show();
		}
	}

}

abstract class Controller {
	boolean power;

	public Controller(boolean power) {
		this.power = power;
	}// 추상클래스이지만 생성자를 생성해서 부모의 것을 가져다 씀

	void show() {
		if (power) {
			System.out.println(getName() + "가 켜졌습니다.");
		} else {
			System.out.println(getName() + "가 켜졌습니다.");
		}
	}

	abstract String getName();// 추상 문자열 메소드
}

class Tv extends Controller {

	@Override
	String getName() {
		// TODO Auto-generated method stub
		return "Tv";
	}

	public Tv(boolean power) {
		super(power);
	}

}

class Radio extends Controller {

	@Override
	String getName() {
		// TODO Auto-generated method stub
		return "Radio";
	}

	public Radio(boolean power) {
		super(power);
	}

}
