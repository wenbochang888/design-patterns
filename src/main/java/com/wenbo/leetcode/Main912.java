package com.wenbo.leetcode;

import java.util.concurrent.ThreadLocalRandom;

public class Main912 {
	public int[] sortArray(int[] nums) {
		sort(nums, 0, nums.length - 1);
		return nums;
	}

	public void sort(int[] a, int left, int right) {
		if (left >= right) {
			return;
		}

		int mid = quickSort(a, left, right);
		sort(a, left, mid - 1);
		sort(a, mid + 1, right);
	}

	public int quickSort(int[] a, int left, int right) {
		int t = getIndex(a, left, right);
		while (left < right) {
			while (left < right && a[right] >= t) {
				right--;
			}
			a[left] = a[right];

			while (left < right && a[left] <= t) {
				left++;
			}
			a[right] = a[left];
		}
		a[left] = t;

		return left;
	}

	public int getIndex(int[] a, int left, int right) {
		int mid = ThreadLocalRandom.current().nextInt(left, right + 1);

		int t = a[mid];
		a[mid] = a[left];
		a[left] = t;
		return a[left];
	}

}
