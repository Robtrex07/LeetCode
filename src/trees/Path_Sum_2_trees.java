package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Path_Sum_2_trees {

	static TreeNode root;

	public static class TreeNode {
		int data;
		TreeNode left;
		TreeNode right;

		public TreeNode(int data) {
			this.data = data;
		}
	}

	public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();

		findPath(root, targetSum, new ArrayList<Integer>(), result);
		return result;

	}

	private void findPath(TreeNode root, int targetSum, ArrayList<Integer> arrayList, List<List<Integer>> result) {

		if (root == null)
			return;
		arrayList.add(root.data);
		if (root.data == targetSum && root.left == null && root.right == null) {
			result.add(arrayList);
			return;
		}
		findPath(root.left, targetSum - root.data, new ArrayList<Integer>(arrayList), result);
		findPath(root.right, targetSum - root.data, new ArrayList<Integer>(arrayList), result);
	}

}
