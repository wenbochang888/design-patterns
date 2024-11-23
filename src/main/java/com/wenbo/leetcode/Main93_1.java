package com.wenbo.leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class Main93_1 {

	public static void main(String[] args) {
		String s = "101023";
		new Main93_1().restoreIpAddresses(s);

	}


	LinkedList<String> path = new LinkedList<>();
	List<String> res = new ArrayList<>();
	public void dfs(String s, int index) {
		if (path.size() > 4) {
			return;
		}
		if (path.size() == 4 && s.length() == index) {
			String collect = path.stream().collect(Collectors.joining("."));
			res.add(collect);
			return;
		}

		for (int i = index; i < s.length(); i++) {
			String subStr = s.substring(index, i + 1);
			if (isValidIp(subStr)) {
				path.add(subStr);
				dfs(s, i + 1);
				path.removeLast();
			}
		}
	}

	private boolean isValidIp(String ip) {
		if (ip == null || ip.length() <= 0 || ip.length() > 4) {
			return false;
		}
		if (ip.length() != 1 && ip.charAt(0) == '0') {
			return false;
		}
		int num = Integer.parseInt(ip);
		return num >= 0 && num <= 255;
	}


	public List<String> restoreIpAddresses(String s) {
		dfs(s, 0);
		return res;
	}

}























