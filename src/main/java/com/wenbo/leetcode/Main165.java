package com.wenbo.leetcode;

public class Main165 {


	public static void main(String[] args) {

		String v1 = "1.01";
		String v2 = "1.001";

		new Main165().compareVersion(v1, v2);
	}

	public int compareVersion(String version1, String version2) {
		StringBuilder v1 = new StringBuilder(version1);
		StringBuilder v2 = new StringBuilder(version2);

		int left = 0;
		int right = 0;
		while (true) {
			if (left > v1.length() && right > v2.length()) {
				return 1;
			}

			StringBuilder sb1 = new StringBuilder();
			while (left < v1.length() && v1.charAt(left) != '.') {
				sb1.append(v1.charAt(left));
				left++;
			}
			left++;
			if (sb1.length() == 0) {
				sb1.append('0');
			}

			StringBuilder sb2 = new StringBuilder();
			while (right < v2.length() && v2.charAt(right) != '.') {
				sb2.append(v2.charAt(right));
				right++;
			}
			right++;
			if (sb2.length() == 0) {
				sb2.append('0');
			}

			int x = Integer.parseInt(sb1.toString());
			int y = Integer.parseInt(sb2.toString());
			if (x < y) {
				return -1;
			} else if (x > y) {
				return 1;
			}
		}
	}
}
