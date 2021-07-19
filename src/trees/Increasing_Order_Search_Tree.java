package trees;

import java.util.ArrayList;
import java.util.List;

public class Increasing_Order_Search_Tree {

	static TreeNode root, newCurr;
	static List<Integer> arr = new ArrayList<Integer>();

	public static class TreeNode {
		int data;
		TreeNode leftChild;
		TreeNode rightChild;

		public TreeNode(int data) {
			this.data = data;

		}
	}

	public static void increasingBST(TreeNode root) {
		if (root == null)
			return;
		inorder(root);

		TreeNode newRoot = new TreeNode(arr.get(0));
		TreeNode head = newRoot;
		for (int i = 1; i < arr.size(); i++) {
			head.rightChild = new TreeNode(arr.get(i));
			head = head.rightChild;
		}
		printTree(newRoot);
		// return newRoot;

	}

	private static void printTree(TreeNode newCurr) {
		//System.out.println("Printing tree");
		if (newCurr == null)
			return;
		if (newCurr != null)
			System.out.printf("%d ", newCurr.data);
		printTree(newCurr.rightChild);
		// TODO Auto-generated method stub

	}

	private static void inorder(TreeNode root) {

		if (root != null) {
			inorder(root.leftChild);
			arr.add(root.data);
			inorder(root.rightChild);
		}
	}

	public static void main(String[] args) {

		Increasing_Order_Search_Tree tree = new Increasing_Order_Search_Tree();
		tree.root = new TreeNode(5);
		root.leftChild = new TreeNode(4);
		root.rightChild = new TreeNode(6);

		increasingBST(root);
	}

}
