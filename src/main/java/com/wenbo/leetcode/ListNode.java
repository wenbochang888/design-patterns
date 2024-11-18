package com.wenbo.leetcode;

import com.wenbo.DesignPattern.utils.GsonUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author changwenbo
 * @date 2023/9/2 17:32
 */
public class ListNode {
	public int val;
	public ListNode next;

	public ListNode() {
	}

	public ListNode(int val) {
		this.val = val;
	}

	public ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}

	public static void print(ListNode head) {
		if (head == null) {
			return;
		}

		List<Integer> list = new ArrayList<>();
		while (head != null) {
			list.add(head.val);
			head = head.next;
		}
		System.out.println(GsonUtils.toJson(list));
	}
}
