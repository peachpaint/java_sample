package ch06;

public class vehicle {
	String name = "탈것";

	void whoami() {
		System.out.println("나는 탈 것이다");
	}

	static void move() {
		System.out.println("이동하다");
	}
}

class Oldcar extends vehicle {
	String name = "자동차";

	@Override
	void whoami() {
		System.out.println("나는 자동차이다");
	}

	static void move() {
		System.out.println("달리다");
	}
}

class Sportscar extends vehicle {
	String name = "자동차";

	@Override
	void whoami() {
		System.out.println("나는 스포츠 자동차이다");
	}

	static void move() {
		System.out.println("쌩 달리다");
	}
}