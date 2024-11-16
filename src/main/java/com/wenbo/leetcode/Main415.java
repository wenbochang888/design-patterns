package com.wenbo.leetcode;

public class Main415 {
	public static void main(String[] args) {


		System.out.println(new Main415().addStrings("99", "999999"));
	}

	public String addStrings(String num1, String num2) {
		if (num1.equals("0")) {
			return num2;
		}

		if (num2.equals("0")) {
			return num1;
		}


		StringBuilder s1 = new StringBuilder(num1).reverse();
		StringBuilder s2 = new StringBuilder(num2).reverse();
		int len1 = s1.length();
		int len2 = s2.length();
		int maxLen = Math.max(len1, len2);


		int flag = 0;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i <= maxLen; i++) {
			int x = i >= s1.length() ? 0 : Integer.parseInt(s1.charAt(i) + "");
			int y = i >= s2.length() ? 0 : Integer.parseInt(s2.charAt(i) + "");

			if (i == maxLen && flag == 0) {
				break;
			}

			int sum = x + y + flag;
			sb.append(sum % 10);
			flag = sum / 10;
		}


		return sb.reverse().toString();
	}
}
