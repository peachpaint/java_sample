package ch06.exercise;

public class OvershadowTest {

	public static void main(String[] args) {
		Parent p1 = new Parent();
		System.out.println(p1.name);
		p1.print();

		Parent p = new Child();
		System.out.println(p.name);
		p.print();
	}

}

class Parent {
	String name = "영조";

	void print() {
		System.out.println("나는 " + name + " 입니다.");
	}
}

class Child extends Parent {
	String name = "사도세자";

	@Override
	void print() {
		System.out.println("나는 " + name + " 이고, 아버지는 " + super.name + "입니다.");
	}
}