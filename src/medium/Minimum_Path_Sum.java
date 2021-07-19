package medium;

public class Minimum_Path_Sum {

	public static int minimumPath(int[][] grid) {

		int min = helper(grid, grid.length-1, grid[0].length-1);
		
		return min;

	}

	private static int helper(int[][] grid, int m, int n) {

		if (m < 0 || n < 0)
			return Integer.MAX_VALUE;
		if (m == 0 && n == 0)
			return grid[m][n];
		return grid[m][n] + Math.min(helper(grid, m - 1, n), helper(grid, m, n - 1));
		// TODO Auto-generated method stub

	}
	
	public static void main(String[] args) {
		
		int[][] grid= {{1,3,1},{1,5,1},{4,2,1}};
		System.out.println(minimumPath(grid));
	}

}
