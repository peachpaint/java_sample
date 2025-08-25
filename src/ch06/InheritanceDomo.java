package ch06;

public class InheritanceDomo {

	public static void main(String[] args) {
		Parent p = new Parent();
		p.name = "부모";
		p.method1();

		Child c = new Child();
		c.name = "my parent";
		c.myName = "나자신";
		c.method1();
		c.method2();
		System.out.println();
	}

}

class Parent {// class는 대문자
	// 필드
	String name;

	// 메서드
	void method1() {
		System.out.println("메서드 1 입니다.");
		System.out.println(name);
	}

}

class Child extends Parent {
	// 부모에게 받은 멤버
	// 자식의 멤버
	String myName;

	void method2() {
		System.out.println("메서드 2 입니다.");
		System.out.println(myName);
	}
}
