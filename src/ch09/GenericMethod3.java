package ch09;

public class GenericMethod3 {

	public static void main(String[] args) {
		Ticket t1 = new Ticket(10);
		Ticket t2 = new Ticket(5);

		System.out.println(t1.compareTo(t2));

		Ticket[] tickets = { new Ticket(10), new Ticket(5), new Ticket(3), new Ticket(7), new Ticket(3) };
		System.out.println(countGT(tickets, tickets[4]));

	}

	public static <T extends Comparable> int countGT(T[] arr, T element) {
		int count = 0;

		for (T t : arr) {
			if (t.compareTo(element) > 0) {
				count++;
			}
		}
		return count;
	}

}

class Ticket<T> implements Comparable<T> {
	int no;

	public Ticket(int no) {
		this.no = no;
	}

	@Override
	public int compareTo(T t) {
		Ticket ticket = (Ticket) t;
		return this.no - ticket.no;
	}

}