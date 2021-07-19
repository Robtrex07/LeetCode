package day1;

public class Palindrome_Number {

	public static boolean palindrome(int x) {
		String s = Integer.toString(x);
		StringBuilder sb = new StringBuilder(Integer.toString(x));
		sb.reverse();
		//s = sb.reverse().toString();
		System.out.println("SB " + sb);
		System.out.println("S " + s);

		if (s.equals(sb.toString())) {
			return true;
		}
		return false;

	}
	
	public static void main(String[] args) {
		int x=1221;
		System.out.println(palindrome(x));
	}

}
