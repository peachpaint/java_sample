package ch06.sec02;

import java.util.Arrays;

public class StaticImportDemo {

	public static void main(String[] args) {
		int[] data = { 5, 3, 1, 2 };

		System.out.println(Arrays.toString(data));
		Arrays.sort(data);
		System.out.println(Arrays.toString(data));

//		Calender c= Calender.getInstance();
//		System.out.println(Calender);
	}

}
