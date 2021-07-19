package trees;

//import geeksForGeeks.Check_For_BST.TreeNode;

public class Root_to_leaf_path {

	static TreeNode root;
	static int sum = 0;

	public static class TreeNode {
		int data;
		TreeNode leftChild;
		TreeNode rightChild;

		public TreeNode(int data) {
			this.data = data;
		}
	}

	public static boolean root_to_leaf(TreeNode root, int x) {
		TreeNode curr=root;
		
		if(curr==null)
			return x==0;
		
		return root_to_leaf(root.leftChild, x-curr.data) || root_to_leaf(root.rightChild, x-curr.data);
		
	}

	public static void main(String[] args) {

		Root_to_leaf_path tree = new Root_to_leaf_path();
		tree.root = new TreeNode(4);
		tree.root.leftChild = new TreeNode(2);
		tree.root.rightChild = new TreeNode(3);
		/*
		 * tree.root.leftChild.leftChild = new TreeNode(1);
		 * tree.root.leftChild.rightChild = new TreeNode(3);
		 */
		System.out.println(root_to_leaf(root, 6));
	}

}
