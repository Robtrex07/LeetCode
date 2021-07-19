package greedy;

public class Split_String_into_balanced_String {
	
	
	public static int splitString(String str)
	{
		int ans=0;
		int count=0;
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='R')
				count++;
			else
				count--;
			
			if(count==0)
				ans++;
		}
		return ans;
	}
	public static void main(String[] args) {
		
		String str="RLLLLRRRLR";
		System.out.println(splitString(str));
		
	}

}
