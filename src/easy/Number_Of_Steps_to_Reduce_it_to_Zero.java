package easy;

public class Number_Of_Steps_to_Reduce_it_to_Zero {

	public static int numberOfSteps(int num) {
		int steps = 0;
		int value = 0;

		while (num > 0) {
			if (num % 2 == 0) {
				num = num / 2;
				steps++;
			}
			if (num % 2 != 0) {
				num = num - 1;
				steps++;
			}
		}
		return steps;

	}

	public static void main(String[] args) {

		int num = 123;
		System.out.println(numberOfSteps(num));
	}
}
