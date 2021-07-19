package divideAndConquer;

import java.util.PriorityQueue;

public class Kth_largest_Element_In_Array {

	public static int kthlargestElement(int[] arr, int k) {

		PriorityQueue<Integer> que = new PriorityQueue<Integer>();

		for (int i : arr) {
			que.add(i);
			//System.out.println("added element " + i);
			while (que.size() > k) {
				//System.out.println("remmoved element " + que.peek());
				que.poll();
			}

		}
		return que.peek().intValue();

	}

	public static void main(String[] args) {

		int[] arr = { 3, 2, 3, 1, 2, 4, 5, 5, 6 };
		int k = 4;
		System.out.println(kthlargestElement(arr, k));
	}

}
