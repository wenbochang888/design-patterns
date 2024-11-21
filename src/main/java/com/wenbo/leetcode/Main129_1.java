package com.wenbo.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class Main129_1 {

	public static void main(String[] args) {

		TreeNode init = TreeNode.init();
		System.out.println(new Main129_1().sumNumbers2(init));
	}


	public int sumNumbers(TreeNode root) {
		if (root == null) {
			return 0;
		}
		Queue<TreeNode> queue = new LinkedList<>();
		Queue<Integer> valQueue = new LinkedList<>();
		queue.add(root);
		valQueue.add(root.val);

		int sum = 0;
		while (!queue.isEmpty()) {
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				TreeNode node = queue.poll();
				Integer num = valQueue.poll();
				if (node.left == null && node.right == null) {
					sum += num;
				}

				if (node.left != null) {
					queue.add(node.left);
					valQueue.add(num * 10 + node.left.val);
				}
				if (node.right != null) {
					queue.add(node.right);
					valQueue.add(num * 10 + node.right.val);
				}
			}

		}

		return sum;
	}


	public int sum = 0;
	public void dfs(TreeNode node, int num) {
		if (node == null) {
			return;
		}
		if (node.left == null && node.right == null) {
			num = num * 10 + node.val;
			sum += num;
			return;
		}

		dfs(node.left, num * 10 + node.val);
		dfs(node.right, num * 10 + node.val);
	}


	public int sumNumbers2(TreeNode root) {
		dfs(root, 0);
		return sum;
	}

}
