package com.wenbo.leetcode;

import java.util.*;

/**
 * @author changwenbo
 * @date 2023/9/3 13:43
 */
public class Main49 {
	public static void main(String[] args) {
		String[] strs = {"eat","tea","tan","ate","nat","bat"};
		new Main49().groupAnagrams(strs);
	}


	public List<List<String>> groupAnagrams(String[] strs) {

		Map<String, List<String>> map = new HashMap<>();
		for (String str : strs) {
			char[] charArray = str.toCharArray();
			Arrays.sort(charArray);
			String s = new String(charArray);

			if (map.containsKey(s)) {
				map.get(s).add(str);
			} else {
				List<String> list = new ArrayList<>();
				list.add(str);
				map.put(s, list);
			}
		}

		return new ArrayList<>(map.values());
	}
}
