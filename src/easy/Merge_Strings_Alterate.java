package easy;

public class Merge_Strings_Alterate {

	public static String mergeStringsAlternate(String str1, String str2) {
		StringBuilder sb = new StringBuilder();

		char[] array1 = str1.toCharArray();
		char[] array2 = str2.toCharArray();
		int i = 0;
		int j = 0;

		while (i < array1.length && j < array2.length) {
			sb.append(array1[i]).append(array2[j]);
			i++;
			j++;
		}

		while (i < array1.length) {
			sb.append(array1[i]);
			i++;
		}

		while (j < array2.length) {
			sb.append(array2[j]);
			j++;
		}
		return sb.toString();

	}

	public static void main(String[] args) {

		String str1 = "ab";
		String str2 = "pqrs";

		System.out.println(mergeStringsAlternate(str1, str2));
	}

}
