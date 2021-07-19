package easy;

public class Highest_Altitude {

	public static int largestAltitude(int[] arr) {
		int maxAltitude = 0;
		int altitude = 0;

		for (int i = 0; i < arr.length; i++) {
			altitude += arr[i];
			maxAltitude = Math.max(maxAltitude, altitude);
		}
		return maxAltitude;
	}

	public static void main(String[] args) {

		int[] arr = { -4,-3,-2,-1,4,3,2 };
		System.out.println(largestAltitude(arr));
	}

}
