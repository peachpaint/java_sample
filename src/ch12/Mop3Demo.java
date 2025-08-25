package ch12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Mop3Demo {

	public static void main(String[] args) {
		List<String> list1 = List.of("안녕 자바!", "잘 가 c++!");
		Stream<String> s1 = list1.stream();
		String[] split = "안녕, 자바!".split(" ");
		Stream<String> s2 = Arrays.stream(split);
		s2.forEach(Util::print);
		System.out.println();

		split = "잘 가, c++!".split(" ");
		s2 = Arrays.stream(split);
		s2.forEach(Util::print);
		System.out.println();

		s1 = list1.stream();
		Stream<String> flatMap = s1.flatMap(s -> Arrays.stream(s.split(" ")));
		flatMap.forEach(Util::print);
		System.out.println();

		List<String> list3 = List.of("안녕 자바!", "잘 가 c++! ", "hello python");
		List<String> list2 = List.of("Good morning");

		System.out.println("스트림 요소인 list.size()는 ?");
		Stream<List<String>> listOf = Stream.of(list1);

		listOf = Stream.of(list2);

		listOf.forEach(l -> System.out.println(l.size()));

//......................................
		Stream.of(list1, list2, list3);
		multiList.filter(l -> l.size() > 1).forEach(Util::print);

	}

}
