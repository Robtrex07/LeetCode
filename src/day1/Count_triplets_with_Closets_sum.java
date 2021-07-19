package day1;

import java.util.HashSet;

public class Count_triplets_with_Closets_sum {

	public static int solution(int[] arr, int k) {
		int closest_sum = Integer.MAX_VALUE;
		int sum = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			HashSet<Integer> set = new HashSet<Integer>();

			for (int j = i + 1; j < arr.length; j++) {
				int x = -(arr[i] + arr[j]);
				System.out.println("arr[i] " +i + " value "+arr[i]);
				System.out.println("arr[j] " +j + " value "+arr[j]);
				System.out.println("x "+x);
				if (set.contains(x)) {
					int y = k - (x + arr[i] + arr[j]);
					System.out.println("y "+y);
					if (Math.abs(k - (x + arr[i] + arr[j])) < Math.abs(closest_sum)) {
						closest_sum = k;
					}
				} else {
					set.add(arr[j]);
					System.out.println("added to set "+arr[j]);
				}

			}
		}
		return closest_sum;
	}

	public static void main(String[] args) {

		int[] arr = { -1, 2, 1, -4 };
		int k = 2;
		System.out.println(solution(arr, k));
	}
}
