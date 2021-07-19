package greedy;

public class Check_If_Binary_String_has_Most_One_Segment_Of_Ones {

	public static boolean checkString(String str) {

		for (int i = 0; i < str.length(); i++) {
			if (i+1<str.length() && str.charAt(i) == '1' && str.charAt(i + 1) == '1')
				return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		String str="1001";
		
		System.out.println(checkString(str));
				
	}

}
