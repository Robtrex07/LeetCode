package easy;

public class Next_Greater_Element {

	public static int[] nextGreater(int[] nums1, int[] nums2) {
		int[] arr = new int[nums1.length];

		for (int i = 0; i < nums1.length; i++) {
			for (int j = 0; j < nums2.length; j++) {
				// System.out.println("value of i " + i + " and value of j " + j);
				if (nums1[i] == nums2[j]) {

					arr[i] = nextGreaterNumber(nums1[i], nums2, j);
				}
			}
			// arr[i] = -1;
		}

		return arr;
	}

	private static int nextGreaterNumber(int i, int[] nums2, int j) {

		int n = nums2.length;

		for (int k = j; k < n; k++) {
			// System.out.println("value of k " + k);
			if (nums2[k] > i)
				return nums2[k];
		}
		return -1;

	}

	public static void main(String[] args) {

		int[] nums1 = { 2, 4 };
		int[] nums2 = { 1, 2, 3, 4 };
		nextGreater(nums1, nums2);
	}

}
