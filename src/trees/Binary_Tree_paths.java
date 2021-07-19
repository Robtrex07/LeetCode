package trees;

import java.util.ArrayList;
import java.util.List;

public class Binary_Tree_paths {

	static TreeNode root;

	public static class TreeNode {
		int data;
		TreeNode left;
		TreeNode right;

		public TreeNode(int data) {
			this.data = data;
		}
	}

	static List<String> result = new ArrayList<String>();

	public static List<String> binaryTreePaths(TreeNode root) {

		helper(root, " ");
		return result;

	}

	private static void helper(TreeNode root2, String curr) {

		if (root == null)
			return;

		if (root.left == null && root.right == null) {
			result.add(curr + root.data);
			return;
		}
		curr += root.data;
		curr += "->";
		helper(root2.left, curr);
		helper(root2.right, curr);

	}

}
