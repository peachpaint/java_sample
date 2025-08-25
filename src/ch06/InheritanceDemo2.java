package ch06;

public class InheritanceDemo2 {

	public static void main(String[] args) {

	}

}

//class A {
//
//}
//
////class A가 class B를 상속
//class B extends A {
//
//}
//class A가 class B를 상속, class B가 class C상속
//class C extends B{
//}

//class A <---- class B
//class A <---- class C
//class A <---- class D

//class A <---- class C 안됨X java 는
//class B <---- class C 안됨X 다중상속 불가
//class A {
//	String name;
//
//	void method1() {
//		System.out.println("A의 메소드");
//	}
//}
//
//class B {
//	String name;
//
//	void method1() {
//		System.out.println("B의 메소드");
//	}
//}
//
//class C extends A,B{//다중 상속 불가!
//	
//}