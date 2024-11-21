package com.wenbo.leetcode;


import com.wenbo.DesignPattern.utils.GsonUtils;

public class Main32 {
	public static void main(String[] args) {

		String s = "))())()()())))";
		new Main32().longestValidParentheses(s);
	}


	public int longestValidParentheses(String s) {
		if (s == null || s.length() <= 1) {
			return 0;
		}

		char[] array = s.toCharArray();
		int[] dp = new int[array.length];

		int max = 0;
		for (int i = 1; i < array.length; i++) {
			char ch = array[i];
			if (ch == '(') {
				continue;
			}

			if (array[i - 1] == '(') {
				dp[i] = i - 2 >= 0 ? dp[i - 2] + 2 : 2;
				continue;
			}

			int index = i - dp[i - 1] - 1;
			if (index < 0) {
				continue;
			}
			if (array[index] == '(') {
				dp[i] = dp[i - 1] + 2;
				if (--index <= 0) {
					continue;
				} else {
					dp[i] += dp[index];
				}

			}
		}

		for (int i : dp) {
			max = Math.max(max, i);
		}

		System.out.println(GsonUtils.toJson(dp));


		return max;
	}


}
















