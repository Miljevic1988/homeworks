package ba.bitcamp.linkednLists;

import java.util.NoSuchElementException;

public class LinkedListDouble {

	public static void main(String[] args) {

		LinkedListDouble list = new LinkedListDouble();

		System.out.println(list);
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		System.out.println(list);

		list.remove(0);
		list.remove(1);
		System.out.println(list);

		System.out.println(list.get(1));
		list.size();
		System.out.println(list.size);

		list.getMiddle();
		System.out.println(list.getMiddle());

		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		list.deleteFirst();
		System.out.println(list);
		list.deleteLast();
		System.out.println(list);

	}

	private Node start;
	private int size;

	/**
	 * Constructor
	 */
	public LinkedListDouble() {
		start = null;
		size = 0;
	}

	/**
	 * This method adds value.
	 */
	public void add(double value) {
		if (start == null) {
			start = new Node(value);
		} else {
			Node last = getLastNode();

			last.setNext(new Node(value));
		}
		value++;
	}

	/**
	 * This method removes value.
	 */
	public void remove(double value) {
		if (value == 0) {
			start = start.getNext();
		} else {
			Node node = get(value);

			Node previous = start;
			while (previous.getNext() != node) {
				previous = previous.getNext();
			}

			previous.setNext(node.getNext());
		}
		value--;
	}

	/**
	 * This method gets value.
	 */
	private Node get(double value) {
		Node temp = start;
		for (int i = 0; i < value; i++) {
			temp = temp.getNext();
		}
		return temp;
	}

	/**
	 * This method gets last node.
	 */
	private Node getLastNode() {
		if (start == null) {
			return null;
		}

		Node temp = start;
		while (temp.getNext() != null) {
			temp = temp.getNext();
		}

		return temp;
	}

	/**
	 * This method gets size.
	 */
	private double size() {
		return size;
	}

	/**
	 * This method returns value from the middle index.
	 */
	public Node getMiddle() {
		if (start == null)
			throw new NoSuchElementException();
		return get((size() - 1) / 2);
	}

	/**
	 * This method returns first element.
	 */
	public double getFirst() {
		if (start == null)
			throw new NoSuchElementException();
		return start.getValue();
	}

	/**
	 * This element returns last element.
	 */
	public Node getLast() {
		if (start == null)
			throw new NoSuchElementException();
		return get(size() - 1);
	}

	/**
	 * This method deletes first element.
	 */
	public void deleteFirst() {
		if (start == null)
			throw new NoSuchElementException();
		start = start.getNext();
	}

	/**
	 * This method deletes last element of the list.
	 */
	public void deleteLast() {
		if (start == null)
			throw new NoSuchElementException();
		remove(size() - 1);
	}

	/**
	 * This method returns info about the list.
	 */
	public String toString() {
		if (start == null)
			return "The list is empty!";
		return start.toString();
	}

	private class Node {

		private double value;
		private Node next;

		/**
		 * Constructor.
		 */
		public Node(double value) {
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

		public double getValue() {
			return value;
		}

		/**
		 * This method returns info about class Node.
		 */
		public String toString() {
			// Base case
			if (next == null) {
				return String.valueOf(value);
			}
			return value + ", " + next.toString();
		}
	}

}