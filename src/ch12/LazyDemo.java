package ch12;

import java.util.stream.IntStream;

public class LazyDemo {

	public static void main(String[] args) {
		IntStream is = IntStream.rangeClosed(1, 5);

		is.filter(x -> {
			System.out.println("filter() : " + x);
			return x % 2 == 0;
		})// predicate
				.map(x -> {
					System.out.println("map() : " + x);
					return x * x;
				})// IntUnaryOperator
				.forEach(x -> System.out.println("forEach() : " + x));

	}

}
