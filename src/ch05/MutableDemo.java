package ch05;

public class MutableDemo {

	public static void main(String[] args) {
		Cat c1 = new Cat("나비");

		Cat c2 = c1; // 객체 주소를 공유하는 것

		System.out.println(c1 + ":" + c2);
		System.out.println(c1.getName());

		int i = 1;
		int j = i; // i의 값을 j에 복사한것
		System.out.println(i + ":" + j);

		j = 3;
		System.out.println(i + ":" + j);

	}

}

class Cat {
	private final String name;

	public Cat(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
//
//	public setName() {
//		this.name = name;
//	}
}
