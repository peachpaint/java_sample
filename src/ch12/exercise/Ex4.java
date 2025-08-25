package ch12.exercise;

import java.util.List;
import java.util.Optional;

public class Ex4 {

	public static void main(String[] args) {
		List<String> capitals = List.of("서울", "워싱턴", "베이징", "파리", "마드리드", "런던");
		Optional<String> first = capitals.stream().sorted().findFirst();
		first.ifPresent(System.out::println);
	}

}
