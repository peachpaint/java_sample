package ch11.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Ex6 {

	public static void main(String[] args) {
		// 로또 6/45 생성
		Random r = new Random();
		List<Integer> list = new ArrayList<>();
		int num = 0;
		while (true) {
			if (list.size() >= 6) {
				break;
			}
			num = r.nextInt(1, 46);
			if (list.contains(num)) {
				continue;
			} else {
				list.add(num);
			}

		}
		Collections.sort(list);
		System.out.println("당첨 번호는 : " + list);
	}

}
