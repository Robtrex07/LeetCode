package greedy;

public class Water_Bottles {

	public static int bottleExchange(int numBottles, int numxchange)

	{
		int sum = numBottles;
		if (numBottles < numxchange)
			return numBottles;

		else {
			while (numBottles >= numxchange) {
				int quo = numBottles / numxchange;
				// System.out.println("quo "+quo);
				int div = numBottles % numxchange;
				// System.out.println("div "+div);
				numBottles = quo + div;
				// System.out.println("no. of "+numBottles);
				sum += quo;
			}
		}
		return sum;

	}

	public static void main(String[] args) {

		int numBottles = 2;
		int numxchange = 3;
		System.out.println(bottleExchange(numBottles, numxchange));
	}

}
