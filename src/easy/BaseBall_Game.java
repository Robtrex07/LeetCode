package easy;

import java.util.*;

public class BaseBall_Game {

	public static int BaseBallGame(String[] str) {

		int currSum = 0;
		List<Integer> list = new ArrayList<Integer>();
		// int[] arr = new int[str.length];
		for (int i = 0; i < str.length; i++) {
			if (str[i].equals("+")) {
				// System.out.println("str[i] " + str[i]);
				int sum = list.get(list.size() - 1) + list.get(list.size() - 2);
				list.add(sum);
				// System.out.println("Sum " + sum);
			}

			else if (str[i].equals("D")) {
				System.out.println("str[i] " + str[i]);
				// System.out.println("get i-1 " + list.get(i - 3));
				int product = 2 * list.get(list.size() - 1);
				// System.out.println("produ " + product);
				list.add(product);
			} else if (str[i].equals("C")) {
				// System.out.println("str[i] " + str[i]);

				list.remove(list.size() - 1);
				// System.out.println("list size " + list.size());
			} else {
				// System.out.println("str[i] " + str[i]);

				list.add(Integer.valueOf(str[i]));
			}
		}

		for (int i : list) {
			currSum += i;
		}
		// System.out.println(currSum);
		return currSum;
	}

	public static void main(String[] args) {

		String[] str = { "5", "-2", "4", "C", "D", "9", "+", "+" };

		BaseBallGame(str);
	}
}
