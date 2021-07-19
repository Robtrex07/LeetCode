package trees;

public class Univalued_Binary_Tree {

	static TreeNode root;

	public static class TreeNode {
		int data;
		TreeNode left;
		TreeNode right;

		public TreeNode(int data) {
			this.data = data;
		}
	}

		public static boolean isUnivalTree(TreeNode root) {
			TreeNode curr = root;
	
			if (curr == null)
				return true;
	
			int data = curr.data;
			//System.out.println("IsUnival data " + curr.data);
			boolean flag = checkUnival(curr, data);
			//System.out.println("flag data " + flag);
	
			if (flag)
				return true;
			else
				return false;
	
		}

	private static boolean checkUnival(TreeNode curr, int data) {

		if (curr == null)
			return true;

		int nodeData = curr.data;
		//System.out.println("Node data " + nodeData + " and " + data);

		if (nodeData != data) {
			System.out.println("inside if");
			return false;
		}

		return checkUnival(curr.left, nodeData) && checkUnival(curr.right, nodeData);
	}

	public static void main(String[] args) {

		Univalued_Binary_Tree tree = new Univalued_Binary_Tree();

		tree.root = new TreeNode(1);
		root.left = new TreeNode(1);
		root.right = new TreeNode(1);

		System.out.println(isUnivalTree(root));
	}
}
