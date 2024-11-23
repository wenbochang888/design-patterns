package com.wenbo.leetcode;

/**
 * @author changwenbo
 * @date 2023/9/10 17:55
 */
public class Main4 {

	public static void main(String[] args) {
	}

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {


		return 1;
	}


	public int binarySearch(int[] a, int target) {
		int left = 0;
		int right = a.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (a[mid] == target) {
				return mid;
			}
			if (a[mid] > target) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}

		return -1;
	}

	public int binarySearchLeft(int[] a, int target) {
		int left = 0;
		int right = a.length - 1;
		while (left <= right) {
			int mid = left + ((right - left) / 2);
			if (a[mid] == target) {
				right = mid - 1;
			} else if (a[mid] > target) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		if (left >= a.length || a[left] != target) {
			return -1;
		}

		return left;
	}

	public int binarySearchRight(int[] a, int target) {
		int left = 0;
		int right = a.length - 1;
		while (left <= right) {
			int mid = left + ((right - left) / 2);
			if (a[mid] == target) {
				left = mid + 1;
			} else if (a[mid] > target) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		if (right < 0 || a[right] != target) {
			return -1;
		}

		return right;
	}
}























