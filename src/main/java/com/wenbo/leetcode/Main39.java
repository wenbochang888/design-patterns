package com.wenbo.leetcode;

import java.util.*;

/**
 * 39. 组合总和
 * https://leetcode.cn/problems/combination-sum/
 *
 * @author changwenbo
 * @date 2023/4/21 14:24
 */
public class Main39 {
	public static void main(String[] args) {
		System.out.println(new Main39().combinationSum(new int[]{2, 3, 6, 7}, 7));
		System.out.println(new Main39().combinationSum(new int[]{2, 3, 5}, 8));
	}

	/**
	 * 输入：candidates = [2,3,6,7], target = 7
	 * 输出：[[2,2,3],[7]]
	 */



	List<List<Integer>> res = new ArrayList<>();
	LinkedList<Integer> path = new LinkedList<>();

	public void dfs(int[] a, int target, int sum, int index) {
		if (sum > target) {
			return;
		}
		if (sum == target) {
			res.add(new ArrayList<>(path));
			return;
		}

		for (int i = index; i < a.length; i++) {
			path.add(a[i]);
			sum += a[i];
			dfs(a, target, sum, i);
			path.removeLast();
			sum -= a[i];
		}
	}

	public void dfs2(int[] a, int target, int sum, int index) {
		if (sum > target) {
			return;
		}
		if (sum == target) {
			res.add(new ArrayList<>(path));
			return;
		}

		for (int i = index; i < a.length; i++) {
			path.add(a[i]);
			dfs2(a, target, sum + a[i], i);
			path.removeLast();
		}
	}


	public List<List<Integer>> combinationSum(int[] a, int target) {
		dfs2(a, target, 0, 0);
		return res;
	}
}

























