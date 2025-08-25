package ch12;

import java.util.Optional;

public class Optional2Demo {

	public static void main(String[] args) {
		String s = "hello";
		Optional<String> o = Optional.ofNullable(s);

		if (o.isPresent()) {
			util.print(o.get());
		} else {
			System.out.println(o.get());
		}

		String s1 = o.orElse("빈 문자열");
		System.out.println(s1);

	}

}
