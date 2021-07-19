package greedy;

public class Is_SubSequence {

	public static boolean isSubSequence(String s, String t) {
		int i = 0;
		int j = 0;

		while (i < s.length() && j < t.length()) {
		//	System.out.println("s char " + s.charAt(i) + " and j char " + t.charAt(j));
			if (s.charAt(i) == t.charAt(j)) {
				i++;
				j++;
			} else {
				if (j < t.length())
					j++;
				else
					return false;
			}

		}

		if (i < s.length())
			return false;
		return true;
	}

	public static void main(String[] args) {

		String s = "axc";

		String t = "ahbgdc";

		System.out.println(isSubSequence(s, t));
	}

}
