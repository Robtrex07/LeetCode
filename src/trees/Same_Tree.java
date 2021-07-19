package trees;

public class Same_Tree {

	static TreeNode root1, root2;

	public static class TreeNode {
		int data;
		TreeNode left;
		TreeNode right;

		public TreeNode(int data) {
			this.data = data;
		}
	}

	public static boolean isSameTree(TreeNode root1, TreeNode root2) {
		if (root1 == null && root2 == null)
			return true;
		if (root1 == null || root2 == null)
			return false;
		//System.out.println("root1.data " + root1.data + " root2.data " + root2.data);
		if (root1.data != root2.data)
			return false;

		return isSameTree(root1.left, root2.left) && isSameTree(root1.right, root2.right);
	}

	public static void main(String[] args) {

		Same_Tree tree = new Same_Tree();

		tree.root1 = new TreeNode(10);
		root1.left = new TreeNode(20);

		tree.root2 = new TreeNode(10);
		root2.right = new TreeNode(20);

		System.out.println(isSameTree(root1, root2));
	}
}
