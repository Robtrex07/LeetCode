package greedy;

public class calculate_money_in_LeetCode_bank {

	public static int totalMoney(int n) {
		int increament = 0;
		int total = 0;
		int amount = 1;
		for (int i = 1; i <= n; i++) {
			total += amount++ + increament;

			if (i % 7 == 0)

			{
				increament++;
				amount = 1;
			}

		}
		return total;
	}
	
	public static void main(String[] args) {
		
		int n=4;
		System.out.println(totalMoney(n));
	}

}
