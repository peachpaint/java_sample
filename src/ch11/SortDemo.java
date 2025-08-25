package ch11;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortDemo {

	public static void main(String[] args) {
		String[] fruits = { "포도", "수박", "사과", "키위", "망고" };
		List<String> list = Arrays.asList(fruits);

//		Set<String> set = set.of("포도", "수박", "사과", "키위", "망고");
//		HashSet<String> hashSet =new HashSet<>(set);

		Collections.sort(list, Collections.reverseOrder());// Reverse_Order 로 정렬하기 위한 Comparator 변환해주는 메소드 |
															// Collections.sort는 List 의 자식만 가능함
		System.out.println(list);

		Collections.reverse(list);// list 의 순서를 거꾸로 마듬
		System.out.println(list);
	}

}
