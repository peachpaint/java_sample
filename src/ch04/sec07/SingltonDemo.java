package ch04.sec07;

public class SingltonDemo {

	public static void main(String[] args) {
//		Singleton s = new Singleton(); 
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();

		System.out.println(s1); // Object 에 있는 toString()에 정의된 바에 의해 주소가 출력됨
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s1 == s3 && s2 == s3);

	}

}

class Singleton {
	// static 변수
	private static Singleton singleton = new Singleton();

	// 생성자
	private Singleton() {

	}

	// static 메서드
	public static Singleton getInstance() {
		return singleton;
	}
}
