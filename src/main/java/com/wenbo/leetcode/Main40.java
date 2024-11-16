package com.wenbo.leetcode;

import java.util.*;

/**
 * 40. 组合总和 II
 * https://leetcode.cn/problems/combination-sum-ii/
 *
 * @author changwenbo
 * @date 2023/4/21 14:24
 */
public class Main40 {
	public static void main(String[] args) {
		System.out.println(new Main40().combinationSum2(new int[]{2,2,2}, 4));
		System.out.println(new Main40().combinationSum2(new int[]{2,5,2,1,2}, 5));
		System.out.println(new Main40().combinationSum2(new int[]{10,1,2,7,6,1,5}, 8));
	}

	/**
	 输入: candidates = [2,5,2,1,2], target = 5,
	 输出:
	 [
	 [1,2,2],
	 [5]
	 ]
	 */



	List<List<Integer>> res = new ArrayList<>();
	LinkedList<Integer> path = new LinkedList<>();
	public List<List<Integer>> combinationSum2(int[] a, int target) {
		Arrays.sort(a);
		dfs(a, target, 0, 0);
		return res;
	}

	public void dfs(int[] a, int target, int sum, int index) {
		if (sum > target) {
			return;
		}
		if (sum == target) {
			res.add(new ArrayList<>(path));
			return;
		}

		for (int i = index; i < a.length; i++) {
			if (i > index && a[i] == a[i - 1]) {
				continue;
			}

			sum += a[i];
			path.add(a[i]);
			dfs(a, target, sum, i + 1);
			sum -= a[i];
			path.removeLast();
		}
	}


}

























