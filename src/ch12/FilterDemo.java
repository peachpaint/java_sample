package ch12;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FilterDemo {

	public static void main(String[] args) {
		Stream<String> of = Stream.of("a1", "b1", "c1", "c2", "c3");

		Stream<String> filterOf = of.filter(s -> s.startsWith("c"));

		Stream<String> skipOf = filterOf.skip(2);

		skipOf.forEach(Util::print);
		System.out.println();

		Stream.of("a1", "b1", "c1", "c2", "c3").filter(s -> s.startsWith("c")).forEach(Util::print);

		IntStream intOf = IntStream.of(1, 2, 2, 3, 4, 4, 5, 6, 7);
		IntStream filterIntOf = intOf.filter(n -> n % 2 == 0);
		IntStream distinct = filterIntOf.distinct();
		distinct.forEach(Util::printWithparenthesis);

		List<Nation> nations = Nation.nations.stream();

	}

}
