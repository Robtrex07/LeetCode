package easy;

import java.util.Collection;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Last_Stone_Weight {

	public static int lastStoneWeight(int[] arr) {
		Queue<Integer> pq = new PriorityQueue<Integer>(Comparator.reverseOrder());
		for (int i : arr)
			pq.add(i);

		while (pq.size() > 1) {
			int y = pq.poll();
			int x = pq.poll();

			if (y > x)
				pq.add(y - x);
		}

		if (pq.size() == 1)
			return pq.peek();
		else
			return 0;

	}

	public static void main(String[] args) {

		int[] arr = { 2, 7, 4, 1, 8, 1 };

		System.out.println(lastStoneWeight(arr));
	}
}
