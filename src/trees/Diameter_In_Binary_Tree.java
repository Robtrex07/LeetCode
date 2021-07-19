package trees;

public class Diameter_In_Binary_Tree {

	static TreeNode root;

	public static class TreeNode {
		int data;
		TreeNode leftChild;
		TreeNode rigthChild;

		public TreeNode(int data) {
			this.data = data;
		}
	}

	static int dia = 0;

	public static int diameter(TreeNode root) {
		if (root == null)
			return 0;
		int ans = helper(root);
		return ans;
	}

	private static int helper(TreeNode root2) {

		if (root2 == null)
			return 0;
		int leftDia = helper(root.leftChild);
		int rightDia = helper(root2.rigthChild);

		dia = Math.max(dia, leftDia + rightDia);

		return Math.max(leftDia, rightDia) + 1;
	}

}
