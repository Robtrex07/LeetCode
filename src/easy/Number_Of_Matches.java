package easy;

public class Number_Of_Matches {

	public static int matchesCount(int n) {
		int matches = 0;
		while (n > 1) {

			if (n % 2 == 0) {
				n = n / 2;

				matches += n;
			} else {
				n = ((n - 1) / 2);
				matches += n;
				n++;

			}
		}
		return matches;
	}

	public static void main(String[] args) {

		int n = 14;
		System.out.println(matchesCount(n));
	}

}
