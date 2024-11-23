package com.wenbo.leetcode;

import com.wenbo.DesignPattern.utils.GsonUtils;

import java.util.Arrays;

/**
 * @author changwenbo
 * @date 2023/10/24 20:55
 */
public class Main105 {
    public TreeNode buildTree(int[] a, int[] b) {
        if (a == null || b == null || a.length <= 0 || b.length <= 0) {
            return null;
        }


        int index = getIndex(a[0], b);
        int[] a1 = Arrays.copyOfRange(a, 1, index + 1);
        int[] a2 = Arrays.copyOfRange(a, index + 1, a.length);

        int[] b1 = Arrays.copyOfRange(b, 0, index);
        int[] b2 = Arrays.copyOfRange(b, index + 1, b.length);
		TreeNode left = buildTree(a1, b1);
        TreeNode right = buildTree(a2, b2);

        return new TreeNode(a[0], left, right);
    }

    private int getIndex(int num, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (num == array[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {0, 1, 2, 3, 4, 5, 6};
        int[] ints = Arrays.copyOfRange(a, 0, a.length);
        System.out.println(GsonUtils.toJson(ints));
    }
}
