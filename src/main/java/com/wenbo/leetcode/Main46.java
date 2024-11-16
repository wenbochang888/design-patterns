package com.wenbo.leetcode;

import java.util.*;

public class Main46 {








	public static void main(String[] args) {
		new Main46().permute(new int[]{1,2,3});
	}



	public List<List<Integer>> res = new ArrayList<>();


	public void dfs(int[] nums, int dept, boolean[] used, LinkedList<Integer> list) {
		if (dept == nums.length) {
			res.add(new ArrayList<>(list));
			return;
		}

		for (int i = 0; i < nums.length; i++) {
			if (!used[i]) {
				used[i] = true;
				list.add(nums[i]);
				dfs(nums, dept + 1, used, list);
				list.removeLast();
				used[i] = false;
			}
		}

	}


	public List<List<Integer>> permute(int[] nums) {


		boolean[] used = new boolean[nums.length];
		dfs(nums, 0, used, new LinkedList<>());

		return res;
	}







}
