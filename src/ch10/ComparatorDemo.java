package ch10;

import java.util.Arrays;

public class ComparatorDemo {

	public static void main(String[] args) {
		String[] strings = {"로마에 가면 로바법을 따르라", "시간은 금이다","펜은 칼보다 강하다"};
		Arrays.sort(Strings, new Comparator<String>);
	}

}

public interface Comparator<T> {
	int compare(T o1, T o2);

}static void Array.sort(T[] a, Comparator<? super T> c);
