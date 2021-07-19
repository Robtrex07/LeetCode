package easy;

public class DI_String_Matching {
	
	public static int[] diMatching(String str)
	{
		int low=0;
		int high=str.length();
		int[] arr=new int[str.length()+1];
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='I')
				arr[i]=low++;
			else
				arr[i]=high--;
		}
		arr[arr.length-1]=high;
		
		for(int i: arr)
			System.out.print(i);
		return arr;
	}
	public static void main(String[] args) {
		
		String str="III	";
		diMatching(str);
	}

}
