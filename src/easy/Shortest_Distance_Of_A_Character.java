package easy;

public class Shortest_Distance_Of_A_Character {

	public static int[] shortestDistance(String S, char C) {

		int[] ans = new int[S.length()];
		int curDist = ans.length;

		for (int i = 0; i < ans.length; i++) {
			curDist = S.charAt(i) == C ? 0 : curDist + 1;
			ans[i] = curDist;
		}

		curDist = ans.length;

		for (int i = ans.length - 1; i >= 0; i--) {
			curDist = S.charAt(i) == C ? 0 : curDist + 1;
			ans[i] = ans[i] > curDist ? curDist : ans[i];
		}

		for(int i: ans)
			System.out.printf("%d ",i);
		
		return ans;

	}
	
	public static void main(String[] args) {
		
		String S="loveleetcode";
		char C='e';
		
		System.out.println(shortestDistance(S, C));
		
	}

}
