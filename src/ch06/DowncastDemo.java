package ch06;

public class DowncastDemo {

	public static void main(String[] args) {
		// class casting exception
//		Person p = new Person();
//
//		Student s = (Student) p;

		Person pp = new Person();
		System.out.println(pp instanceof Student);
		System.out.println(pp instanceof Person);
		System.out.println(pp instanceof Object);

		Student s = new Student();

		System.out.println(s instanceof Student);
		System.out.println(s instanceof Person);
		System.out.println(s instanceof Object);
		Person p = s;// upcasting, 자동형변환
		System.out.println(p.name);
		p.whoAmI();
		Student s2 = (Student) p;// downcasting, 명시적 형변환
//		System.out.println(s2, number);
//		s2.work();
//
//		Person pArr = new Person[4];
//		pArr[0] = new Student();
//		pArr[1] = new Employee();
//		pArr[2] = new SportsPlayer();
//		pArr[3] = new Entertainer();
//
//		for (Person person : pArr) {
//			Person.whoAmI();
//			downcast(person);
////			if (person instanceof Student s) {
////				// Student s0 = (Student) person;
////				s.work();
////			} else if (person instanceof Employee e) {
////				// Employee e0 = (Employee) person;
////				e.work();
////			} else if (person instanceof SportsPlayer sp) {
////				// SportsPlaye sp0 = (SportsPlaye) person;
////				sp.work();
////			} else if (person instanceof Entertainer et) {
////				// SportsPlaye et0 = (Enterainer) person;
////				et.work();
////			}
//
//			s2 = (student) person;
			s2.work();
		}
//	}

	public static void downcast(Person person) {
		person.work();
//		if (person instanceof Student) {
//			Student s0 = (Student) person;
//			s0.work();
//		} else if (person instanceof Employee) {
//			Employee e0 = (Employee) person;
//			e0.work();
//		} else if (person instanceof SportsPlayer) {
//			SportsPlaye sp0 = (SportsPlayer) person;
//			sp0.work();
//		} else if (person instanceof Entertainer) {
//			SportsPlaye et0 = (Entertainer) person;
//			et0.work();
//		}
	}

}
