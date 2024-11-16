package com.wenbo.leetcode;

public class Main160 {


	public static void main(String[] args) {

	}

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if (headA == null || headB == null) {
			return null;
		}

		ListNode dummyA = new ListNode();
		dummyA.next = headA;

		ListNode dummyB = new ListNode();
		dummyB.next = headB;

		while (headA != null && headB != null) {
			if (headA == headB) {
				return headA;
			}
			if (headA.next == null && headB.next == null) {
				return null;
			}

			headA = headA.next == null ? dummyB.next : headA.next;
			headB = headB.next == null ? dummyA.next : headB.next;

		}

		return null;
	}
}
