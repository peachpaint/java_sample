package ch08.exercise;

import ch06.Person;

public class Ex_1_2 {

	public static void main(String[] args) {
		Person p1 = new Person("111111", "홀길동");
		Person p2 = new Person("111111", "손흥민");
		Person p3 = new Person("123456", "손흥민");

		if (p1.equals(p2)) {
			System.out.println("같은 사람이다");
		} else {
			System.out.println("다른 사람이다");
		}
		if (p2.equals(p3)) {
			System.out.println("같은 사람이다");
		} else {
			System.out.println("다른 사람이다");
		}

	}

}

class Person{
	String number;
	String name;
	
	public
}
