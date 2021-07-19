package greedy;

public class Latest_Time_By_Replacing_Hidden_Digits {

	public static void maximumTime(String s) {
		
		String[] str=s.split(":");
		for(int i=0;i<str.length;i++)
		{
			String ss=str[i];
			for(int j=0;j<ss.length();j++)
			{
				if(ss.charAt(j)=='?')
					ss.replace('?', 'a');
			}
			
		}

	}
	
	public static void main(String[] args) {
		
		String s ="2?:20";
		maximumTime(s);
	}

}
