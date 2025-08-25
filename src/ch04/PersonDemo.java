package ch04;

public class PersonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		p.setAge(21).setName("민국").setnationality("대한민국").sayHellow();

	}

}

class Person {
	private String name;
	private int age;
	private String nationality;// 캡슐화

	public Person setName(String Name) {
		this.name = name;
		return this;
	}

	public Person setAge(int age) {
		this.age = age;
		return this;
	}

	public Person setnationality(String nationality) {
		this.nationality = nationality;
		return this;
	}

	public void sayHellow() {
		System.out.println("국적이" + nationality + "에 사는" + age + "살" + name + "입니다");
	}
}
