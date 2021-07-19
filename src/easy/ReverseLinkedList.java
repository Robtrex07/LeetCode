package easy;

public class ReverseLinkedList {

	static Node head;

	public static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}
	}

		public static Node reverse(Node head) {
			Node curr = head;
			Node previous = null;
			Node next;
	
			while (curr != null) {
				next = curr.next;
				curr.next = previous;
				previous = curr;
				curr = next;
			}
			return previous;
		}

}
