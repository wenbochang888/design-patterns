package com.wenbo.leetcode;

import java.util.*;

public class Main131 {


	public static void main(String[] args) {
		String s = "aab";
		new Main131().partition(s);


		StringBuilder sb = new StringBuilder("1");
		StringBuilder sb2 = new StringBuilder("1");
		System.out.println(sb.equals(sb2));
		System.out.println(sb.toString().equals(sb2.toString()));
	}


	List<List<String>> res = new ArrayList<>();
	LinkedList<String> path = new LinkedList<>();
	public void dfs(String s) {
		// 退出条件
		if (s == null || s.length() == 0) {
			res.add(new ArrayList<>(path));
			return;
		}

		for (int i = 1; i <= s.length(); i++) {
			String str = s.substring(0, i);
			if (!isPartition(str)) {
				continue;
			}
			path.add(str);
			dfs(s.substring(i, s.length()));
			path.removeLast();
		}
	}

	public boolean isPartition(String s) {
		StringBuilder sb = new StringBuilder(s).reverse();
		return s.equals(sb.toString());
	}

	public List<List<String>> partition(String s) {
		dfs(s);
		return res;
	}
}
