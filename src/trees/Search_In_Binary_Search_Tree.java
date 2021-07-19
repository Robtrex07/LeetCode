package trees;

public class Search_In_Binary_Search_Tree {

	static TreeNode root;

	public static class TreeNode {
		int data;
		TreeNode left;
		TreeNode right;

		public TreeNode(int data) {
			this.data = data;
		}
	}

	public static TreeNode findNode(TreeNode root, int val) {
		TreeNode curr = root;

		if (curr == null)
			return null;

		if (curr.data == val) {
			// System.out.println(root.data);
			return root;
		}

		TreeNode next = null;

		if (val < curr.data) {
			if (curr.left != null) {
				next = findNode(curr.left, val);
			}
		} else {
			if (curr.right != null) {
				next = findNode(curr.right, val);
			}
		}
		return next;

	}

	public static void main(String[] args) {

		Search_In_Binary_Search_Tree tree = new Search_In_Binary_Search_Tree();

		tree.root = new TreeNode(10);
		root.left = new TreeNode(5);
		root.left.right = new TreeNode(7);
		root.right = new TreeNode(20);

		System.out.println(findNode(root, 7));
	}

}
