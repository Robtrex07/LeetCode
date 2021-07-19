package day1;

import javax.print.attribute.standard.Finishings;

public class Median_of_Two_Sorted_Array {

	public static Float Median(int[] arr1, int[] arr2) {
		
		
		int n = arr1.length;
		int m = arr2.length;
		int[] arr = new int[n + m];
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < n && j < m) {
			if (arr1[i] < arr2[j]) {
				arr[k] = arr1[i];
				k++;
				i++;
			} else {
				arr[k] = arr2[j];
				j++;
				k++;
			}
		}

		while (i < n) {
			arr[k] = arr1[i];
			i++;
			k++;
		}
		while (j < m) {
			arr[k] = arr2[j];
			j++;
			k++;
		}

		int arr_length = arr.length;
		if (arr_length % 2 != 0) {
			return (float)(arr[arr.length / 2]);
		} else
			return (float)(arr[arr.length / 2] + arr[(arr.length / 2)-1]) / 2;
	}
public static void main(String[] args) {
	
	int[] arr1= {1, 4,5};
	int[] arr2= {2, 3};
	System.out.println(Median(arr1, arr2));
}
}
