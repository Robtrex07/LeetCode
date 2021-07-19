package greedy;

public class Minimum_Changes_To_Make_Alternate_Binary_String {

	public static int minimumChangesToMakeStringBinary(String str) {

		int change = 0;
		// char[] newArr = str.toCharArray();
		for (int i = 0; i < str.length(); i += 2) {
			System.out.println("i: " + i);
			if (str.charAt(i) == '0' && str.charAt(i + 1) == '0') {
				// System.out.println("inside if 1");
				change++;
			}
			if ( i<str.length()-1 &&str.charAt(i) == '1' && str.charAt(i + 1) == '1')
				change++;

		}
		return change;

	}

	public static void main(String[] args) {

		String str = "001";
		System.out.println(minimumChangesToMakeStringBinary(str));
	}

}
