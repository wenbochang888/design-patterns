package com.wenbo.leetcode;

/**
 * @author changwenbo
 * @date 2024/11/16 15:50
 */
public class Main221 {

    public static void main(String[] args) {
        char[][] a = {{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
        System.out.println(new Main221().maximalSquare(a));
    }



    public int maximalSquare(char[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m][n];
        int max = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == '0') {
                    continue;
                }
                int x = getNum(dp, i, j - 1);
                int y = getNum(dp, i - 1, j - 1);
                int z = getNum(dp, i - 1, j);
                dp[i][j] = Math.min(x, Math.min(y, z)) + 1;
                max = Math.max(max, dp[i][j]);
            }
        }

        return max * max;
    }

    private int getNum(int[][] dp, int x, int y) {
        if (x < 0 || y < 0) {
            return 0;
        }

        if (x >= dp.length || y >= dp[0].length) {
            return 0;
        }

        return dp[x][y];
    }

}
