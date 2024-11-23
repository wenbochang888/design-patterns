package com.wenbo.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author changwenbo
 * @date 2023/10/25 21:31
 */
public class Main101 {
	// 递归方法
	public boolean isSymmetric(TreeNode root) {
		if (root == null) {
			return true;
		}

		return symmetric(root.left, root.right);
	}

	public boolean symmetric(TreeNode left, TreeNode right) {
		if (left == null && right == null) {
			return true;
		}
		if (left == null || right == null) {
			return false;
		}
		if (left.val != right.val) {
			return false;
		}
		return symmetric(left.left, right.right) && symmetric(left.right, right.left);
	}

	// 迭代方法
	public boolean isSymmetric2(TreeNode root) {
		if (root == null) {
			return true;
		}

		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root.left);
		queue.add(root.right);
		while (!queue.isEmpty()) {
			TreeNode left = queue.poll();
			TreeNode right = queue.poll();
			if (left == null && right == null) {
				continue;
			}
			if (left == null || right == null) {
				return false;
			}

			if (left.val != right.val) {
				return false;
			}
			queue.add(left.left);
			queue.add(right.right);
			queue.add(left.right);
			queue.add(right.left);
		}

		return true;
	}
}
