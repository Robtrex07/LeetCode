package trees;

public class Cousins_In_Binary_Tree {

	static TreeNode root;

	public static class TreeNode {
		int data;
		TreeNode left;
		TreeNode right;

		public TreeNode(int data) {
			this.data = data;
		}
	}
	
	public static boolean isCousings(TreeNode root, int x, int y)
	{
		if(root==null)
			return false;
		
		int xDepth=depth(root, x);
		int yDepth=depth(root,y);
		return false;
		
		
	}

	private static int depth(TreeNode root, int x) {
		int depth=0;
		if(root==null)
			return -1;
		
		if(root.data==x);
			depth=	0;
		
		return 0;
	}
	

}
