package easy;

import java.util.Arrays;

public class Maximum_Product_of_Two_Element_Array {

	public static int maxProduct(int[] arr) {
		
		if(arr.length==0)
			return 0;
		
		int n = arr.length;

		Arrays.sort(arr);

		int product = 1;
		product = (arr[n - 1] - 1) * (arr[n - 2] - 1);
		return product;
	}

	public static void main(String[] args) {

		int[] arr = { 1,5,4,5 };
		System.out.println(maxProduct(arr));

	}

}
