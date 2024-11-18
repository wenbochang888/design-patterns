package com.wenbo.leetcode;

public class Main69 {


	static double n = 1e-10;
	static int s;
	public static void main(String[] args) {

		int x = 10;
		s = 10;
		new Main69().sqrts(x);


	}

	public double sqrts(double x){
		double res = (x + s / x) / 2;
		System.out.println(res);
		if (res == x) {
			return x;
		} else {
			return sqrts(res);
		}
	}


	// 精度
	public double mySqrt2(int x) {
		double left = 0;
		double right = x;
		while (true) {
			double mid = left + ((right - left) / 2);
			double res = mid * mid;
			System.out.println(res);
			if (Math.abs(res - x) <= n) {
				return mid;
			}

			if (mid * mid > x) {
				right = mid;
			} else {
				left = mid;
			}
		}
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
