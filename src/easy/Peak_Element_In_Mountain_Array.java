package easy;

public class Peak_Element_In_Mountain_Array {

	public static int find(int arr[]) {

		int low = 0;
		int high = arr.length - 1;

		int peak = findPeak(arr, low, high);
		return peak;
	}

	public static int findPeak(int[] arr, int low, int high) {

		int mid = (low + high) / 2;
		System.out.println("mid value " + mid);
		if (mid == 0 || arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1] || mid == arr.length - 1) {
			System.out.println("inside if");
			return mid;
		} else if (arr[mid - 1] > arr[mid]) {
			System.out.println("inside first else if");
			return findPeak(arr, low, mid );
		} else {
			System.out.println("inside second else of");
			return findPeak(arr, mid + 1, high);
		}

	}

	public static void main(String[] args) {

		int[] arr = { 3,4,5,24,69,100,99,79,78,67,36,26,19 };
		System.out.println(find(arr));
	}

}
