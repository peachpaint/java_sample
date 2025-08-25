package ch11;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		Queue<String> q = new LinkedList<>();
		q.offer("A");
		q.offer("B");
		q.offer("C");

		while (!q.isEmpty()) {
			System.out.println(q.poll());
		}
		q.add("D");
		q.add("E");
		q.add("F");// add는 맨 뒤에 넣음
		while (!q.isEmpty()) {
			System.out.println(q.poll());
		}
//		Queue<String> q1 = new ArrayList<>(); //ArrayList는 안됨
//		q.offer("A");
//		q.offer("B");
//		q.offer("C");
//
//		while (!q1.isEmpty()) {
//			System.out.println(q1.poll());
//		}
	}

}
