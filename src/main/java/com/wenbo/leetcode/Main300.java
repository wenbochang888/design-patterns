package com.wenbo.leetcode;

public class Main300 {


	public static void main(String[] args) {
		int[] a = {0,1,0,3,2,3};
		System.out.println(new Main300().lengthOfLIS(a));
	}



	public int lengthOfLIS(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}

		int[] dp = new int[nums.length];
		int max = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < i; j++) {
				if (nums[i] > nums[j]) {
					dp[i] = Math.max(dp[j] + 1, dp[i]);
				}
			}
			max = Math.max(max, dp[i]);
		}


		return max + 1;
	}
}











