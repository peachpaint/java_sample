package dataStructure;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
//		System.out.println();

		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list);

		list.addFirst(3);
		list.addFirst(2);
		list.addFirst(1);
		System.out.println(list);

		System.out.println(list.getFirst());
		System.out.println(list.getLast());

		list.addLast(100);
		System.out.println(list);// 마지막 100 붙임

		System.out.println(list.remove());// == removeFrist()
		System.out.println(list);
		System.out.println(list.removeFirst());
		System.out.println(list);
		System.out.println(list.removeLast());
		System.out.println(list);

	}

}
