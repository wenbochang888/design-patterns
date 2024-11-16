package com.wenbo.leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class Main93 {

	public static void main(String[] args) {

		String s = "101023";
		System.out.println(new Main93().restoreIpAddresses(s));
	}

	List<String> res = new ArrayList<>();
	LinkedList<String> path = new LinkedList<>();

	public void dfs(String s) {
		if (path.size() > 4) {
			return;
		}
		if (path.size() == 4) {
			if (s == null || s.length() == 0) {
				String collect = path.stream().collect(Collectors.joining("."));
				res.add(collect);
			}
			return;
		}

		for (int i = 1; i <= s.length(); i++) {
			String ip = s.substring(0, i);
			if (!isValid(ip)) {
				break;
			}
			path.add(ip);
			dfs(s.substring(i, s.length()));
			path.removeLast();
		}
	}


	public void dfs2(String s, int pos) {
		if (path.size() > 4) {
			return;
		}
		if (path.size() == 4) {
			if (s.length() == pos) {
				String collect = path.stream().collect(Collectors.joining("."));
				res.add(collect);
			}
			return;
		}

		for (int i = pos; i < s.length(); i++) {
			String ip = s.substring(pos, i + 1);
			if (!isValid(ip)) {
				break;
			}
			path.add(ip);
			dfs2(s, i + 1);
			path.removeLast();
		}
	}


	public List<String> restoreIpAddresses(String s) {
		dfs2(s, 0);
		return res;
	}

	private boolean isValid(String ip) {
		if (ip == null || ip.length() == 0) {
			return false;
		}

		if (ip.length() != 1 && ip.charAt(0) == '0') {
			return false;
		}

		if (ip.length() > 3) {
			return false;
		}

		int code = Integer.parseInt(ip);
		if (code >= 0 && code <= 255) {
			return true;
		}

		return false;
	}
}























