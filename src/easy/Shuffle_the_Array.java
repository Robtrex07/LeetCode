package easy;

public class Shuffle_the_Array {

	public static void shffle(int[] arr, int n) {

		int[] newArr = new int[arr.length];

		for(int i=0;i<n;i++)
		{
			newArr[2*i]=arr[i];
			newArr[2*i+1]=arr[i+n];
		}
		
		for(int j=0;j<newArr.length;j++)
		{
			System.out.printf("%d ",newArr[j]);
		}

	}

	public static void main(String[] args) {

		int[] arr = { 2, 5, 1, 3, 4, 7 };
		int n = 3;
		shffle(arr, n);
	}

}
