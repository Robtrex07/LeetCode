package medium;

public class Max_Consecutive_Ones_with_K_Flip {

	public static int longestOnes(int[] A)

	{
		int start = 0;
		int maxConsecOnes = 0;
		int end = 0;
		int zeroCount = 0;
		int k = 2;

		for (end = 0; end < A.length; end++) {
			if (A[end] == 0)
				zeroCount++;

			while (zeroCount > k) {
				if (A[start] == 0)
					zeroCount--;
				start++;
			}
		
		maxConsecOnes=Math.max(maxConsecOnes, end-start+1);
		}
		return maxConsecOnes;

	}
	
	public static void main(String[] args) {
		
		int[] A= {1,1,1,0,0,0,1,1,1,1,0};
		System.out.println(longestOnes(A));
	}

}
