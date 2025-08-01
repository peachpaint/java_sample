package ch05.Enum;

public class BeforeEnumDemo {

	public static void main(String[] args) {
//		System.out.println(People.MALE);
//		System.out.println(People.FEMALE);
//		System.out.println(People.ONE);
//		System.out.println(People.TWO);
//
//		System.out.println(People.MALE == People.ONE);

		System.out.println(Gender.MALE);
		System.out.println(Gender.FEMALE);

		System.out.println(NUM.ONE);
		System.out.println(NUM.TWO);

//		System.out.println(Gender.MALE == NUM.ONE);

		People p = new People();
		p.age = 21;
		p.gender = Gender.MALE;

		if (p.age >= 18) {
			System.out.println("성인입니다");
		}
//		if(p.) 
	}

}

//class People {
//	// 정적(클래스, static)상수
//	static final int MALE = 0;
//	static final int FEMALE = 1;
//	static final int ONE = 2;
//	static final int TWO = 3;
//
//	// 인스턴스상수
//	final int KIND = 0;
//	final int NUM = 1;
//}
class People {
	int age;
	Gender gender;
}

enum Gender {
	// 상수
	MALE("남성"), FEMALE("여성");

	// 필드
	String gender;

	// 생성자
	Gender(String gender) {
		this.gender = gender;
	}

	// 메서드
	@Override
	public String toString() {

		return gender;
	}

}

enum NUM {
	ONE, TWO
}
