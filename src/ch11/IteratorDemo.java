package ch11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		Collection<String> list = Arrays.asList("다람쥐", "개구리", "나비");
//		list.add("라마");//list가 불변 객체 add불가
//		list.remove("라마");//list가 불변 객체 add불가

		System.out.println(list.size());

		Collection<String> list1 = new ArrayList<>(Arrays.asList("다람쥐", "개구리", "나비"));
		list1.add("라마");
		list1.add("나비");
		System.out.println(list1.size());

		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		Iterator<String> iterator1 = list1.iterator();
		while (iterator1.hasNext()) {
			System.out.println(iterator1.next());

		}
		list1.remove("나비");

		iterator1 = list1.iterator();
		while (iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}

	}

}
