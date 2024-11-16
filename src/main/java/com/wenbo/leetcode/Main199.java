package com.wenbo.leetcode;

import java.util.*;

/**
 * @author changwenbo
 * @date 2023/11/1 20:27
 */
public class Main199 {
	public List<Integer> rightSideView(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		if (root == null) {
			return list;
		}

		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				TreeNode node = queue.poll();
				if (node.left != null) {
					queue.add(node.left);
				}
				if (node.right != null) {
					queue.add(node.right);
				}
				if (i == size - 1) {
					list.add(node.val);
				}
			}

		}


		return list;
	}
}
