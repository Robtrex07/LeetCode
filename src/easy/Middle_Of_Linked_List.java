package easy;

public class Middle_Of_Linked_List {

	static Node head;

	public static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;

		}
	}

	@SuppressWarnings("unused")
	public static Node LinkedListMiddle(Node head) {

		Node curr = head;
		Node slowPointer, fastPointer;
		slowPointer = fastPointer = head;
		// System.out.println(head.next.data);
		if (head != null) {
			while (fastPointer.next != null) {
				fastPointer = fastPointer.next;
				if (fastPointer.next != null) {
					slowPointer = slowPointer.next;
					fastPointer = fastPointer.next;
					// System.out.println("slowpointer data "+slowPointer.data + " and fastpoiter
					// "+fastPointer.data);
				}
			}
		}
		//System.out.println(slowPointer.data);
		return slowPointer;

	}

	public static void main(String[] args) {

		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		//head.next.next.next.next = new Node(50);

		System.out.println(LinkedListMiddle(head));
	}
}
