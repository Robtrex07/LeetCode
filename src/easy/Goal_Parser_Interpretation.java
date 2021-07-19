package easy;

import java.util.HashMap;

public class Goal_Parser_Interpretation {

	static HashMap<String, String> map = new HashMap<String, String>();

	static {
		map.put("G", "G");
		map.put("()", "o");
		map.put("(al)", "al");
	}

	public static String interpret(String command) {
		if (command.isEmpty() || command.length() == 1) {
			return command;
		}

		StringBuilder sb = new StringBuilder();
		int length = command.length();
		for (int i = 0; i < length; i++) {
			char c = command.charAt(i);
			if (c == 'G') {
				sb.append('G');
			} else if (c == '(' && i < length - 1 && command.charAt(i + 1) == ')') {
				sb.append("o");
				i++;
			} else {
				sb.append("al");
				i += 3;
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {

		String str = "G()(al)";
		System.out.println(str.length());
		System.out.println(interpret(str));
	}

}
