package easy;

import java.util.ArrayList;
import java.util.List;

public class Is_Leaf_Similar {
	static TreeNode root1, root;

	public static class TreeNode {
		int data;
		TreeNode left;
		TreeNode right;

		public TreeNode(int data) {
			this.data = data;
		}
	}

	public static boolean isLeafSimilar(TreeNode root1, TreeNode root2) {

		List<Integer> l1 = new ArrayList<Integer>();
		List<Integer> l2 = new ArrayList<Integer>();

		if (root1 == null && root2 == null)
			return true;

		l1 = addLeafNodes(root1);
		l2 = addLeafNodes(root2);

		if (l1.size() != l2.size())
			return false;

		for (int i = 0; i < l1.size(); i++) {
			if (l1.get(i).intValue() != l2.get(i).intValue())
				return false;
		}

		return true;

	}

		private static List<Integer> addLeafNodes(TreeNode root) {
	
			List<Integer> result = new ArrayList<Integer>();
	
			if (root == null)
				return result;
	
			if (root.left == null && root.right == null) {
				result.add(root.data);
	
			}
	
			addLeafNodes(root.left);
			addLeafNodes(root.right);
	
			// TODO Auto-generated method stub
			return result;
		}

}
