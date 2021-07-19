package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Average_Of_Level_Order {

	static TreeNode root;

	public static class TreeNode {
		int data;
		TreeNode left;
		TreeNode right;

		public TreeNode(int data) {
			this.data = data;
		}
	}

	public static List<Double> findAverage(TreeNode root) {

		List<Double> list = new ArrayList<Double>();
		Queue<TreeNode> q = new LinkedList<TreeNode>();

		if (root == null)
			return list;

		q.add(root);

		while (!q.isEmpty()) {
			double sum = 0.0;
			int n = q.size();
			for (int i = 0; i < n; i++) 	{
				TreeNode temp = q.poll();
				sum += temp.data;

				if (temp.left != null)
					q.add(temp.left);

				if (temp.right != null)
					q.add(temp.right);
			}
			list.add(sum / n);
		}

		return list;

	}

}
