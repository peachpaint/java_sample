package ch04.sec06;

public class PersonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Person p = new Person() {
//			p.setAge(21).setName("민국").setNationality("대한민국")
//		}
	}

}

class Person {
	private String name;
	private int age;
	private String nationality;

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
