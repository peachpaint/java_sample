package ch12;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		Integer i = 0;
		Optional<Integer> e = Optional.empty();// Optional.empty
		System.out.println(e.isEmpty());

		Optional<Integer> of = Optional.of(3);
		System.out.println(of);
		System.out.println(of.get());

		Optional<Integer> ofNullable = Optional.ofNullable(i);// Optional.ofNullable
		if (!ofNullable.isEmpty()) {
			System.out.println(ofNullable.get());
		}

		i = 10;
		ofNullable = Optional.ofNullable(i);// Optional.ofNullable
		System.out.println(ofNullable);
		if (!ofNullable.isEmpty()) {
			System.out.println(ofNullable.get());
		}
		ofNullable.ifPresenti(i);
	}

}
