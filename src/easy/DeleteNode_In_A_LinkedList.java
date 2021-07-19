package easy;

public class DeleteNode_In_A_LinkedList {

	Node head;

	public static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}
	}

	public static void deleteNode(Node node)

	{
		Node temp = node.next;
		node.data = temp.data;
		node.next = temp.next;
	}
}
