package com.wenbo.leetcode;

import java.util.*;

public class Main103 {















	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> res = new ArrayList<>();
		if (root == null ) {
			return res;
		}

		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);

		int cnt = 0;
		while (!queue.isEmpty()) {
			int size = queue.size();
			LinkedList<Integer> list = new LinkedList<>();
			for (int i = 0; i < size; i++) {
				TreeNode node = queue.poll();
				if (node.left != null) {
					queue.add(node.left);
				}
				if (node.right != null) {
					queue.add(node.right);
				}

				if ((cnt & 1) == 1) {
					list.addFirst(node.val);
				} else {
					list.addLast(node.val);
				}
			}

			res.add(list);
			cnt++;
		}



		return res;
	}





}












