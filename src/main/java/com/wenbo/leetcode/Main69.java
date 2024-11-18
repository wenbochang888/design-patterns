package com.wenbo.leetcode;

public class Main69 {


	public static void main(String[] args) {
		int left = 24;
		int right = 123;
		int mid = right + ((left - right) >> 1);
		System.out.println(mid + "  " + (left + right) / 2);

		System.out.println(new Main69().mySqrt(123));
	}


	public int mySqrt(int x) {
		if (x <= 1) {
			return x;
		}
		int left = 0;
		int right = x;
		while (left < right && right - left > 1) {
			long mid = right + ((left - right) >> 1);
			if (mid * mid == x) {
				return (int) mid;
			}
			if (mid * mid > x) {
				right = (int) mid;
			} else {
				left = (int) mid;
			}
		}

		return left;
	}

}
