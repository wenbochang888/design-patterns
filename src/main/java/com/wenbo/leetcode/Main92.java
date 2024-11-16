package com.wenbo.leetcode;

public class Main92 {





















	public ListNode reverseBetween(ListNode head, int left, int right) {
		if (head == null || head.next == null) {
			return head;
		}

		ListNode preHead = new ListNode();
		preHead.next = head;
		ListNode dummy = preHead;

		for (int i = 1; i < left; i++) {
			preHead = preHead.next;
		}

		ListNode pre = preHead;
		ListNode cur = pre.next;
		ListNode next = cur.next;


		for (int i = 0; i < right - left + 1; i++) {
			cur.next = pre;
			pre = cur;
			cur = next;
			if (next != null) {
				next = next.next;
			}
		}

		preHead.next.next = cur;
		preHead.next = pre;


		return dummy.next;
	}
}















