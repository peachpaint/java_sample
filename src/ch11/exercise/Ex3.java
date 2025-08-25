package ch11.exercise;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Map<String, Integer> map = new Hashtable<>();

		map.put("김열공", 80);
		map.put("최고봉", 90);
		map.put("우등생", 95);
		map.put("나자바", 88);

		System.out.println("이름을 입력하세요 : ");
		String name = in.nextLine();
		if (name != null && !name.isBlank()) {
			System.out.println(map.get(name));
		}
	}

}
