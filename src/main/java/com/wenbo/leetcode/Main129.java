package com.wenbo.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class Main129 {

	public static void main(String[] args) {
	}




	public int sumNumbers(TreeNode root) {
		if (root == null) {
			return 0;
		}
		Queue<TreeNode> nodeQueue = new LinkedList<>();
		Queue<Integer> valQueue = new LinkedList<>();
		nodeQueue.add(root);
		valQueue.add(root.val);

		int sum = 0;
		while (!nodeQueue.isEmpty()) {
			int size = nodeQueue.size();
			for (int i = 0; i < size;i ++) {
				TreeNode node = nodeQueue.poll();
				Integer val = valQueue.poll();

				if (node.left == null && node.right == null) {
					sum += val;
					continue;
				}

				if (node.left != null) {
					nodeQueue.add(node.left);
					valQueue.add(val * 10 + node.left.val);
				}
				if (node.right != null) {
					nodeQueue.add(node.right);
					valQueue.add(val * 10 + node.right.val);
				}

			}
		}
		return sum;
	}


	int sum = 0;
	public void dfs(TreeNode node, StringBuilder sb) {
		if (node == null) {
			return;
		}

		sb.append(node.val);
		if (node.left == null && node.right == null) {
			int i = Integer.parseInt(sb.toString());
			sum += i;
		}
		dfs(node.left, sb);
		dfs(node.right, sb);
		sb.deleteCharAt(sb.length() - 1);
	}



}
