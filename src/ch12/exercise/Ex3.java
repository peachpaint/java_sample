package ch12.exercise;

import java.util.stream.Stream;

public class Ex3 {

	public static void main(String[] args) {
		Stream<String> anmals = Stream.of("갈매기", "나비", "다람쥐", "라마");
		anmals.filter(s -> s.length() == 2).forEach(System.out::println);
	}

}
