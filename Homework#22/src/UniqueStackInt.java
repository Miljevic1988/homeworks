import java.util.*;

public class UniqueStackInt {

	private Node start;

	/**
	 * This method pushes given value on stack.
	 */
	public int push(int value) {
		if (start == null) {
			start = new Node(value);
			return value;
		}
		Node tmp = start;
		while (tmp.getNext() != null) {
			if (tmp.getValue() == value)
				return value;
			tmp = tmp.getNext();
		}
		tmp = new Node(value);
		tmp.setNext(start);
		start = tmp;
		return value;
	}

	/**
	 * This method pops first element from stack.
	 */
	public int pop() {
		if (start == null)
			throw new EmptyStackException();
		int value = start.getValue();
		start = start.getNext();
		return value;
	}

	/**
	 * This method returns true if values in stack are increasing.
	 */
	public boolean isIncreasing() {
		if (start == null)
			return true;
		int tmpValue = start.getValue();
		Node tmp = start;
		while (tmp.getNext() != null) {
			tmp = tmp.getNext();
			if (tmpValue <= tmp.getValue()) {
				tmpValue = tmp.getValue();
			} else {
				return false;
			}
		}
		return true;
	}

	private class Node {

		private int value;
		private Node next;

		public Node(int value) {
			this.value = value;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public int getValue() {
			return value;
		}

		public String toString() {
			if (next == null)
				return String.valueOf(value);
			return value + ", " + next.toString();
		}
	}
}