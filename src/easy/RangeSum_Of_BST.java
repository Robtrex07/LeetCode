package easy;

import easy.RangeSum_Of_BST.TreeNode;

public class RangeSum_Of_BST {

	static TreeNode root;
	static int sum = 0;

	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		public TreeNode(int val) {
			this.val = val;
		}
	}

	public static int rangeSumBST(TreeNode root, int low, int high) {

		//int sum = 0;
		// int sum2 = 0;
		if (root == null)
			return 0;
		// System.out.println("rootvalue " + root.val);
		if (root.val >= low && root.val <= high) {
			sum += root.val;
			// System.out.println("sum " + sum);
		}
		rangeSumBST(root.left, low, high);
		rangeSumBST(root.right, low, high);
		return sum;

	}

	public static void main(String[] args) {

		RangeSum_Of_BST tree = new RangeSum_Of_BST();
		tree.root = new TreeNode(20);
		tree.root.left = new TreeNode(17);
		tree.root.right = new TreeNode(25);
		tree.root.left.left = new TreeNode(15);
		tree.root.right.right = new TreeNode(27);

		System.out.println(rangeSumBST(root, 6, 20));

	}

}
