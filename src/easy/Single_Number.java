package easy;

import java.util.HashSet;
import java.util.Set;

public class Single_Number {

	public static int singleNumber(int[] arr) {
		Set<Integer> set = new HashSet<Integer>();

		for (int i : arr) {
			if (set.contains(i))
				set.remove(i);
			else
				set.add(i);
		}
		return set.iterator().next();
	}
	
	public static void main(String[] args) {
		
		int[] arr= {2,2,1};
		System.out.println(singleNumber(arr));
	}

}
