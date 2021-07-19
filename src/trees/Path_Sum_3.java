package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Path_Sum_3 {

	static TreeNode root;
	static int count = 0;

	List<Integer> list = new ArrayList<Integer>();

	public static class TreeNode {
		int data;
		TreeNode leftChild;
		TreeNode rightChild;

		public TreeNode(int data) {
			this.data = data;
		}
	}

	public int pathSum(TreeNode root, int sum) {

		findSum(root, sum);
		return count;

	}

	private void findSum(TreeNode root, int sum) {

		if (root == null)
			return;
		list.add(root.data);

		findSum(root.leftChild, sum);
		findSum(root.rightChild, sum);
		int temp = 0;
		for (int i = list.size(); i >= 0; i--) {
			temp += list.get(i);
			if (temp == sum)
				count++;

		}
		list.remove(list.size() - 1);
	}

}
