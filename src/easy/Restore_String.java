package easy;

import java.util.Arrays;

public class Restore_String {

	public static String restoreString(String s, int[] indices) {
		char[] newArr = new char[indices.length];
		StringBuilder sb=new StringBuilder();

		for (int i = 0; i < indices.length; i++) {
			newArr[indices[i]] = s.charAt(i);
			// System.out.println("indices value "+indices[i] + " char at string
			// "+s.charAt(indices[i]));
			// System.out.println("char at ");
			// System.out.println("new arr value at " + newArr[i]+ " is
			// "+newArr[indices[i]]);
		}
		//sb.append(Arrays.toString(newArr));
		
		return new String(newArr);
	}

	public static void main(String[] args) {

		String s = "codeleet";
		int[] indices = { 4, 5, 6, 7, 0, 2, 1, 3 };
		System.out.println(restoreString(s, indices));
	}

}
