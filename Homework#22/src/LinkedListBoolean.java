import java.util.*;

public class LinkedListBoolean {

	private Node start;

	/**
	 * This method adds given value to list.
	 */
	public void add(boolean value) {
		if (start == null) {
			start = new Node(value);
			return;
		}
		Node tmp = start;
		while (tmp.getNext() != null) {
			tmp = tmp.getNext();
		}
		tmp.setNext(new Node(value));
	}

	/**
	 * This method removes given value from the list.
	 */
	public void remove(boolean value) {
		if (start == null)
			throw new NoSuchElementException();
		if (start.getValue() == value) {
			start = start.getNext();
			return;
		}
		Node previous = start;
		Node tmp = start.getNext();
		while (tmp != null) {
			if (tmp.getValue() == value) {
				previous.setNext(tmp.getNext());
				return;
			}
			previous = tmp;
			tmp = tmp.getNext();
		}
		throw new NoSuchElementException();
	}

	/**
	 * This method removes given element from list, after given index.
	 */
	public void remove(boolean value, int index) {
		if (start == null || index < 0 || index >= size())
			throw new ArrayIndexOutOfBoundsException();
		Node previous = start;
		for (int i = 0; i < index; i++) {
			previous = previous.getNext();
		}
		Node tmp = previous.getNext();
		for (int i = index; i < size(); i++) {
			if (tmp.getValue() == value) {
				previous.setNext(tmp.getNext());
				return;
			}
		}
		throw new NoSuchElementException();
	}

	/**
	 * This method returns true if given element is in the list.
	 */
	public boolean contains(boolean value) {
		Node tmp = start;
		for (int i = 0; i < size(); i++) {
			if (tmp.getValue() == value)
				return true;
		}
		return false;
	}

	/**
	 * This method returns true if elements are alternating.
	 */
	public boolean isAlternating() {
		if (start == null)
			return true;
		Node tmp = start;
		boolean tmpValue = start.getValue();
		for (int i = 0; i < size(); i++) {
			if (tmp.getValue() == tmpValue) {
				tmpValue = !tmpValue;
			} else {
				return false;
			}
			tmp = tmp.getNext();
		}
		return true;
	}

	/**
	 * List size.
	 */
	public int size() {
		Node tmp = start;
		int size = 0;
		while (tmp != null) {
			size++;
			tmp = tmp.getNext();
		}
		return size;
	}

	/**
	 * This method gives info about th list.
	 */
	public String toString() {
		if (start == null) {
			return "The list is empty!";
		}
		return start.toString();
	}

	private class Node {

		private boolean value;
		private Node next;

		/*
		 * Constructor.
		 */
		public Node(boolean value) {
			this.value = value;
		}

		/**
		 * Getters and setters.
		 */
		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public boolean getValue() {
			return value;
		}

		/**
		 * This method gives info about the node.
		 */
		public String toString() {
			if (next == null)
				return String.valueOf(value);
			return value + ", " + next.toString();
		}
	}
}
