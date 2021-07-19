package greedy;

import java.util.PriorityQueue;
import java.util.Queue;

public class Maximum_Size_Of_Array_After_K_Negations {

	public static int maxSizeAfterKNegations(int[] arr, int k) {
		Queue<Integer> que = new PriorityQueue<Integer>();

		for (int i : arr)
			que.add(i);

		while (k > 0) {
			int top = que.poll();

			if (top == 0 && k % 2 == 0)
				break;
			else
				top = -top;
			que.add(top);
			k--;
		}
		int sum = 0;
		while (!que.isEmpty())
			sum += que.poll();
		return sum;
	}
public static void main(String[] args) {
	
	
	int[] arr= {3,-1,0,2};
	
	int k=3;
	
	System.out.println(maxSizeAfterKNegations(arr, k));
}
}
