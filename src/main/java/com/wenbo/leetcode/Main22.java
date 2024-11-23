package com.wenbo.leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class Main22 {

	public static void main(String[] args) {
		new Main22().generateParenthesis(2);
	}

	LinkedList<String> path = new LinkedList<>();
	List<String> res = new ArrayList<>();

	public void dfs(int left, int right) {
		if (left > right) {
			return;
		}
		if (left == 0 && right == 0) {
			String collect = path.stream().collect(Collectors.joining());
			res.add(collect);
			return;
		}

		if (left > 0) {
			path.add("(");
			dfs(left - 1, right);
			path.removeLast();
		}

		if (right > 0) {
			path.add(")");
			dfs(left, right - 1);
			path.removeLast();
		}
	}

	public List<String> generateParenthesis(int n) {
		dfs(n, n);
		return res;
	}
}
