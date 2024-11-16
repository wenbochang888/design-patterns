package com.wenbo.leetcode;

import java.util.*;

public class Main51 {



	List<List<String>> res = new ArrayList<>();

	public void dfs(char[][] a, int n, int dept) {
		if (n == dept) {

			List<String> list = new ArrayList<>();
			for (int i = 0; i < a.length; i++) {
				StringBuilder sb = new StringBuilder();
				for (int j = 0; j < a.length; j++) {
					sb.append(a[i][j]);
				}
				list.add(sb.toString());
			}
			res.add(list);
			return;
		}


		for (int i = 0; i < n; i++) {
			// dept 代表深度x轴
			// i 代表宽度，y轴

			if (isValid(a, n, dept, i)) {
				a[dept][i] = 'Q';

				dfs(a, n, dept + 1);

				a[dept][i] = '.';
			}
		}

	}


	public boolean isValid(char[][] a, int n, int x, int y) {
		// 竖轴
		for (int i = 0; i < n; i++) {
			if (a[i][y] == 'Q') {
				return false;
			}
		}

		// 斜对角


		// 检查45度对角线
		for (int i=x, j=y; i>=0 && j>=0; i--, j--) {
			if (a[i][j] == 'Q') {
				return false;
			}
		}

		// 检查135度对角线
		for (int i=x, j=y; i>=0 && j<=n-1; i--, j++) {
			if (a[i][j] == 'Q') {
				return false;
			}
		}


		return true;
	}


	public List<List<String>> solveNQueens(int n) {

		char[][] a = new char[n][n];

		for (int i = 0; i < n; i++) {
			Arrays.fill(a[i], '.');
		}


		dfs(a, n, 0);


		return res;
	}

	public static void main(String[] args) {
		System.out.println(new Main51().solveNQueens(4));
	}



}
