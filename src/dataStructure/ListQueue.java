package dataStructure;

public class ListQueue<E> {
	// 필드
	private Node<E> front;
	private Node<E> rear;
	private int size;

	// 생성자
	public ListQueue() {
		front = rear = null;
		size = 0;
	}

	// offer, poll, peek
	public void offer(E item) {// 단일연결리스트의 addLast()
		if (isEmpty()) {
			addFirst(item);
		} else {
			Node<E> newNode = new Node<>(item, null);
			rear.next = newNode;
			rear = newNode;
			size++;
		}
	}

	void addFirst(E item) {
		Node<E> newNode = new Node(item, null);
		if (isEmpty()) {
			rear = newNode;
		}
		newNode.next = front;
		front = newNode;
		size++;
	}

	public E poll() {// 단일연결리스트의 removeFirst() / underflow
		if (isEmpty()) {
			return null;
		}
		// 지워지는 노드를 백업 받아놓음
		Node<E> removedNode = front;
		// head 를 갱신
		front = front.next;
		// 지워지는 노드 정리
		removedNode.next = null;
		if (size == 1) {
			front = rear = null;
		}
		size--;
		return removedNode.item;
	}

	public E peak() {
		if (isEmpty()) {
			return null;
		}
		return front.item;
	}

	// size, ieEmpty
	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	// Node
	private class Node<E> {
		E item;
		Node<E> next;

		public Node(E item, Node<E> next) {
			this.item = item;
			this.next = next;
		}
	}

	@Override
	public String toString() {
		String list = "[";
		for (Node<E> n = front; n != null; n = n.next) {
			if (n.next != null) {
				list += n.item + ",";
			} else {
				list += n.item;
			}
		}
		;
		return "ListQueue" + list + "]";
	}
}
