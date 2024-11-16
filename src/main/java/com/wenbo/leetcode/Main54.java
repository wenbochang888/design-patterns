package com.wenbo.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Main54 {


	public static void main(String[] args) {

		int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		new Main54().spiralOrder(a);
	}



	public List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> list = new ArrayList<>();

		int left = 0;
		int right = matrix[0].length - 1;
		int top = 0;
		int down = matrix.length - 1;


		int sum = (matrix.length * matrix[0].length);
		while (sum != list.size()) {
			// 左边 --> 右边
			for (int i = left; i <= right; i++) {
				list.add(matrix[top][i]);
			}
			top++;
			if (sum == list.size()) {
				break;
			}

			// 上边 --> 下边
			for (int i = top; i <= down; i++) {
				list.add(matrix[i][right]);
			}
			right--;
			if (sum == list.size()) {
				break;
			}

			// 右边 --> 左边
			for (int i = right; i >= left; i--) {
				list.add(matrix[down][i]);
			}
			down--;
			if (sum == list.size()) {
				break;
			}

			// 下边 --> 上边
			for (int i = down; i >= top; i--) {
				list.add(matrix[i][left]);
			}
			left++;
			if (sum == list.size()) {
				break;
			}
		}

		return list;
	}



}
