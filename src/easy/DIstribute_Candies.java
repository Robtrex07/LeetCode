package easy;

import java.util.HashSet;

public class DIstribute_Candies {

	public static int distributeCandies(int[] arr) {
		HashSet<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (!set.contains(arr[i]))
				set.add(arr[i]);
		}

		int setSize = set.size();
		int arrSize = arr.length / 2;

		int result = Math.min(setSize, arrSize);

		return result;

	}
	
	public static void main(String[] args) {
		
		int[] arr= {1,1,1,1};
		System.out.println(distributeCandies(arr));
	}

}
