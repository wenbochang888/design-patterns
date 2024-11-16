package com.wenbo.leetcode;

import com.alibaba.fastjson2.JSON;

public class Main1143 {
	public int longestCommonSubsequence(String s1, String s2) {


		int[][] dp = new int[s1.length() + 1][s2.length() + 1];
		for (int i = 1; i <= s1.length(); i++) {
			for (int j = 1; j <= s2.length(); j++) {
				if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
					dp[i][j] = dp[i - 1][j - 1] + 1;
				} else {
					dp[i][j] = Math.max(Math.max(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]);
				}
			}
		}


		for (int i = 0; i < dp.length; i++) {
			System.out.println(JSON.toJSONString(dp[i]));
		}

		return dp[s1.length()][s2.length()];
	}


	public static void main(String[] args) {
		String s1 = "bsbininm";
		String s2 = "jmjkbkjkv";

		new Main1143().longestCommonSubsequence(s1, s2);
	}

}
