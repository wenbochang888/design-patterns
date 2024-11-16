package com.wenbo.leetcode;

public class Main124 {

	public static void main(String[] args) {


	}


	int max = Integer.MIN_VALUE;
	public int dfs(TreeNode node) {
		if (node == null) {
			return 0;
		}

		if (node.left == null && node.right == null) {
			max = Math.max(max, node.val);
			return Math.max(0, node.val);
		}

		int left = node.val + dfs(node.left);
		int right = node.val + dfs(node.right);

		max = Math.max(max, left + right - node.val);

		return Math.max(0, Math.max(left, right));
	}


	public int maxPathSum(TreeNode root) {
		dfs(root);
		return max;
	}
}
