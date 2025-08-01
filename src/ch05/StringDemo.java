package ch05;

public class StringDemo {

	public static void main(String[] arge) {
		String s1 = "J";
		String s2 = "C";

		String s3 = new String("J");
		String s4 = "j";

		System.out.println("s1 == s3 : " + (s1 == s3));
		System.out.println("s1.equal(s3) : " + s1.equals(s3));

		System.out.println("s3.equalsIgnoreCase(s4) : " + s3.equalsIgnoreCase(s4));

		System.out.println("s1.compareTo(s2) : " + s1.compareTo(s2));
		System.out.println("s2.compareTo(s1) : " + s1.compareTo(s1));

	}

}
