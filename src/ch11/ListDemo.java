package ch11;

import java.util.Arrays;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		String[] animal1 = { "사슴", "호랑이", "바다표범", "곰" };// add 와 remove 사용X, set 사용O, 해당 index 의 요소 tn정O
		List<String> animal2 = Arrays.asList(animal1);// add 와 remove 사용X, set 사용O

		animal2.set(0, "앵무새");
		for (int i = 0; i < animal2.size(); i++) {
			System.out.println(animal2.get(i));
		}

		animal2.sort((o1, o2) -> o1.length() - o2.length());
		for (int i = 0; i < animal2.size(); i++) {
			System.out.println(animal2.get(i));
		}

//		List<Integer> numbers = List.of(1, 2, 3, 4, 5);// immutable(불변객체) -> add 와 remove, set 사용X / sort 사용X
//		numbers.set(0, 10);
	}

}
