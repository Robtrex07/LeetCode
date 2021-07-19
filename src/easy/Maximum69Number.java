package easy;

public class Maximum69Number {

	public static int maxNumber(int n) {

		return Integer.parseInt(Integer.toString(n).replaceFirst("6", "9"));
	}
	public static void main(String[] args) {
		
		int n=9999;
		System.out.println(maxNumber(n));
	}
}
