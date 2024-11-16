package com.wenbo.leetcode;

import java.util.*;

public class Main78 {


	public static void main(String[] args) {

		new Main78().subsets(new int[]{1, 2, 3});
	}



	List<List<Integer>> res = new ArrayList<>();


	public void dfs(int[] nums, int dept, int start, boolean[] used, LinkedList<Integer> list) {


		res.add(new ArrayList<>(list));
		System.out.println(res);

		for (int i = start; i < nums.length; i++) {
			if (!used[i]) {
				used[i] = true;
				list.add(nums[i]);

				dfs(nums, dept + 1, i + 1, used, list);

				list.removeLast();
				used[i] = false;

			}
		}


	}



	public List<List<Integer>> subsets(int[] nums) {
		boolean[] used = new boolean[nums.length];
		dfs(nums, 0, 0, used, new LinkedList<>());
		return res;
	}

}
