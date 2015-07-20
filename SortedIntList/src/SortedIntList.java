import java.util.Scanner;

public class SortedIntList {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		SortedIntList list = new SortedIntList();

		System.out.println("Enter any number of positive numbers: ");

		while (true) {
			int n = s.nextInt();

			if (n > 0) {
				list.add(n);
			} else {
				break;
			}
		}

		System.out.printf("You entered %d positive numbers. \n",
				list.getLength());

		System.out.println("Sorted numbers:");
		for (int currentN : list.toArray()) {
			System.out.println(currentN);
		}
	}

	private Node start;

	/**
	 * Adds element to list.
	 */
	public void add(int n) {

		Node newNode = new Node(n, start);

		if (start == null) {
			start = newNode;
		} else {
			Node temp = start;
			if (temp.getValue() > newNode.getValue()) {
				newNode.setNext(start);
				start = newNode;
				return;
			}

			while (temp.getNext() != null) {
				if (newNode.getValue() < temp.getNext().getValue()) {
					newNode.setNext(temp.getNext());
					return;
				}
				temp = temp.getNext();
			}
			temp.setNext(newNode);
		}
	}

	/**
	 * Returns length of the list.
	 */
	public int getLength() {
		if (start == null)
			return 0;
		return getRecursion(start);
	}

	private int getRecursion(Node start) {
		if (start.getNext() == null)
			return 1;
		return getRecursion(start.getNext()) + 1;
	}

	/**
	 * Converts list to an array.
	 */
	public int[] toArray() {
		int n = getLength();
		int[] result = new int[n];

		Node tmp = start;
		for (int i = 0; i < n; i++) {
			result[i] = tmp.getValue();
			tmp = tmp.getNext();
		}

		return result;
	}

	/**
	 * This method gets info about the list.
	 */
	public String toString() {
		if (start == null)
			return "The list is empty!!!";
		return start.toString();
	}

	private class Node {

		private int value;
		private Node next;

		/**
		 * Constructor.
		 */
		public Node(int value, Node next) {
			super();
			this.value = value;
			this.next = next;
		}

		/**
		 * Getters and setters.
		 */
		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		/**
		 * This method gives info about the node.
		 */
		public String toString() {
			if (next == null)
				return String.valueOf(value);
			return String.valueOf(value) + " " + next;
		}
	}
}
