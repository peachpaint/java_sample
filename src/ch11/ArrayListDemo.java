package ch11;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<String> list = List.of("그랜저", "소나타", "아반떼", "제네시스", "소울");// immutable

		List<String> car1 = new ArrayList<>(list);
		car1.add("싼타페");// list 에 add 를 넣으면 맨 뒤에 붙임
		car1.add(0, "모닝");//
		System.out.println(car1);
		System.out.println(car1.contains(""));

		List<String> car2 = new ArrayList<>(list);
		car2.remove("제네시스");
		System.out.println(car2);

		System.out.println(car1.containsAll(car2));

		car1.removeIf(c -> c.startsWith("소"));
		System.out.println(car1);

		car1.replaceAll(c -> "New" + c);
		System.out.println(car1);

		car1.forEach(c -> System.out.println(c));

		car1.clear();
		System.out.println(car1.isEmpty());

	}

}
