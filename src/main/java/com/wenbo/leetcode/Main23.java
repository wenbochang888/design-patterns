package com.wenbo.leetcode;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main23 {















	public ListNode mergeKLists(ListNode[] lists) {
		if (lists == null || lists.length == 0) {
			return null;
		}

		Queue<ListNode> queue = new PriorityQueue<>((x, y) -> x.val - y.val);
		for (ListNode node : lists) {
			if (node != null) {
				queue.add(node);
			}
		}


		ListNode dummy = new ListNode();
		ListNode cur = dummy;

		while (!queue.isEmpty()) {
			ListNode poll = queue.poll();
			cur.next = poll;
			cur = poll;

			if (poll.next != null) {
				queue.add(poll.next);
			}
		}


		return dummy.next;
	}
}


















