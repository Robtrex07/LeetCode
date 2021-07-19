package greedy;

public class Number_Of_Rectangles_That_Form_Largest_Square {

	public static int largestSquare(int[][] arr) {

		int maxLength = 0;
		int numberOfSquares = 0;

		for (int[] a : arr) {
			int length = Math.min(a[0], a[1]);

			if (maxLength == length)
				++numberOfSquares;
			else if (length > maxLength) {
				maxLength = length;
				numberOfSquares = 1;
			}
		}
		return numberOfSquares;

	}

	public static void main(String[] args) {

		int[][] arr = { { 5, 8 }, { 3, 9 }, { 5, 12 }, { 16, 5 } };
		System.out.println(largestSquare(arr));
		;
	}

}
