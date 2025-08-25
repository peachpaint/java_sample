package ch08.exercise;

public class Ex_2 {

	public static void main(String[] args) {
		System.out.println(new Student("김삿갓"));
		System.out.println(new Student("홍길동"));
	}

}

class Student {
	String name;

	public Student(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("학생[%s]", name);
	}

}
