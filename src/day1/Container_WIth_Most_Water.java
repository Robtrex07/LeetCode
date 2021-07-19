package day1;

public class Container_WIth_Most_Water {

	public static int solution(int[] arr) {
		int area = 0;
		int maxArea = 0;
		int l = 0;
		int r = arr.length - 1;
		
		if(arr.length<=0)
			return 0;

		while (l < r) {
			area = Math.min(arr[l], arr[r]) * (r - l);
			if (area > maxArea) {
				maxArea = area;
			}
			if (arr[l] < arr[r])
				l++;
			else
				r--;

		}
		return maxArea;

	}

	public static void main(String[] args) {

		int[] arr = { 3,1,2,4,5 };
		System.out.println(solution(arr));
	}

}
