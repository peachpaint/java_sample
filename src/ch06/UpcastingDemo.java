package ch06;

public class UpcastingDemo {

	public static void main(String[] args) {
		Student s = new Student();

		Person p = s; // 자식객체를 가리키는 주소를 부보타입의 참조변수
		System.out.println(p.name);
		p.whoAmI();

		downcast(s);

		Student[] sArr = new Student[3];
//		Employee[] eArr = new Student[3];

	}

	public static void downcast(Person p) {
		p.whoAmI();

	}

}
