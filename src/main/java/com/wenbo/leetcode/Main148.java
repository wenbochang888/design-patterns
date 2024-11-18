package com.wenbo.leetcode;

/**
 * @author changwenbo
 * @date 2023/10/23 21:52
 */
public class Main148 {

	public static void main(String[] args) {
		ListNode head = new ListNode(4);
		ListNode h1 = head.next = new ListNode(2);
		ListNode h2 = h1.next = new ListNode(1);
		ListNode h3 = h2.next = new ListNode(3);

		ListNode.print(head);
		new Main148().sortList(head);
		ListNode.print(head);
	}

	// 冒泡排序
	public ListNode sortList(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}

		while (head.next != null) {
			ListNode cur = head.next;
			while (cur != null) {
				ListNode next = head.next;
				if (cur.val < head.val) {
					head.next = cur.next;
					if (cur == next) {
						cur.next = head;
					} else {
						cur.next = next;
					}

					ListNode t = head;
					head = cur;
					cur = t;
				} else {
					cur = cur.next;
				}
			}
			head = head.next;
		}
		return head;
	}
}
