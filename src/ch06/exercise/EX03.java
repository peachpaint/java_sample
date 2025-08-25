package ch06.exercise;

public class EX03 {

	public static void main(String[] args) {
		Person[] persons = new Person[3];
//		Person[0] = new Person("길동이", 22);
//		Person[1] = new Student("황진이", 23, "100");
//		Person[2] = new ForeignStudent("Amy", 30, "200", "U.S.A");

		for (Person person : persons) {
			System.out.println(person.show());
		}

	}

}

class Person {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

//	public String getAge() {
////		return age;
//	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String show() {
		return String.format("사람[이름: %s, 나이: %d]", name, age);
	}
}

class Student extends Person {
	private String number;

	public String getNumber() {
		return number;
	}

	public Student(String name, int age, String number) {
		super(name, age);// 부모 person에서 downcasting함
		this.number = number;
	}

//	@Override
//	public String show() {
//		return String.format("사람[이름: %s, 나이: %d, 학번: %s ]", super.getName(), super.getAge(), number);
//	}
}

class ForeignStudent extends Student {
	private String nationality;

	public String getNationality() {
		return nationality;
	}

	public ForeignStudent(String name, int age, String number, String nationality) {
		super(name, age, number);
		this.nationality = nationality;
	}

//	@Override
//	public String show() {
//		return String.format("사람[이름: %s, 나이: %d, 학번: %s , 국적: %s]", super.getName(), super.getAge(), super.getNumber(),
//				nationality);
//	}
}
