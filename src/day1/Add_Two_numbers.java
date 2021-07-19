package day1;

public class Add_Two_numbers {

	static Node head;

	public static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}
	}

	public Node addTwoNumbers(Node l1, Node l2) {
		Node dummyHead = new Node(0);
		Node p = l1, q = l2, curr = dummyHead;
		int carry = 0;
		while (p != null || q != null) {
			int x = (p != null) ? p.data : 0;
			int y = (q != null) ? q.data : 0;
			int sum = carry + x + y;
			carry = sum / 10;
			curr.next = new Node(sum % 10);
			curr = curr.next;
			if (p != null)
				p = p.next;
			if (q != null)
				q = q.next;
		}
		if (carry > 0) {
			curr.next = new Node(carry);
		}
		return dummyHead.next;
	}

}