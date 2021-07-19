package easy;

public class Substract_Product_And_Sum {

	public static int productSum(int n) {
		String s = Integer.toString(n);

		int product = 1;
		;
		int sum = 0;

		for (char cc : s.toCharArray()) {
			// System.out.println("Product "+product);
			product *= cc - '0';
			// System.out.println("cc "+cc + " and "+product);
			sum += cc - '0';
		}
		//System.out.println("product " + product + " and " + sum);

		return product - sum;

	}

	public static void main(String[] args) {

		int n = 234;
		System.out.println(productSum(n));
	}

}
