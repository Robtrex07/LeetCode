	package trees;

//max height or depth

public class Max_Depth_Of_Binary_Tree {

	static TreeNode root;

	public static class TreeNode {

		int data;
		TreeNode leftChild;
		TreeNode rigthChild;

		public TreeNode(int data) {
			this.data = data;
		}
	}

	public static int findDepth(TreeNode root) {
		if (root == null)
			return 0;

		int leftCount = findDepth(root.leftChild);
		int rigthCount = findDepth(root.rigthChild);

		if (leftCount > rigthCount)
			return leftCount += 1;
		else
			return rigthCount += 1;

	}
	public static void main(String[] args) {
		
		Max_Depth_Of_Binary_Tree temp=new Max_Depth_Of_Binary_Tree();
		temp.root=new TreeNode(10);
		temp.root.leftChild=new TreeNode(20);
		
		System.out.println(findDepth(root));
	}

}
