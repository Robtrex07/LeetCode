package trees;

public class Merge_Two_Binary_Trees {

	static TreeNode root1, root2;

	public static class TreeNode {
		int data;
		TreeNode leftChild;
		TreeNode rightChild;

		public TreeNode(int data) {
			this.data = data;
		}
	}

	public static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
		TreeNode curr1 = root1;
		TreeNode curr2 = root2;
		TreeNode root3 = null;

		if (curr1 == null && curr2 == null)
			return null;

		if (curr1 == null)
			return curr2;

		if (curr2 == null)
			return curr1;
		 
		root3 = new TreeNode(curr1.data + curr2.data);

		root3.leftChild=mergeTrees(curr1.leftChild, curr2.leftChild);
		root3.rightChild=mergeTrees(curr1.rightChild, curr2.rightChild);

		//printTree(root3);

		return root3;
	}

	private static void printTree(TreeNode root3) {
		TreeNode curr = root3;
		if (curr != null) {
			printTree(curr.leftChild);
			System.out.printf("%d ", curr.data);
			printTree(curr.rightChild);
		}

	}

	public static void main(String[] args) {

		Merge_Two_Binary_Trees tree = new Merge_Two_Binary_Trees();

		tree.root1 = new TreeNode(2);
		root1.leftChild = new TreeNode(3);

		tree.root2 = new TreeNode(4);
		tree.root2.leftChild = new TreeNode(6);
		tree.root2.rightChild = new TreeNode(8);

		mergeTrees(root1, root2);

	}

}
