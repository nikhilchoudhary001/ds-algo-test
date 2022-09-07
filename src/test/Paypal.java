package test;

import java.util.HashSet;

public class Paypal {

	public static void main(String[] args) {
		String s = "aabbabcdaa";
		System.out.println(longestSubstring(s));

	}
	
	// Q2. Find the Length of Longest Substring without Repeating Characters

	// Input: s = "abcdabab"
	// Output: 4

	// Input: s = "bbbbb"
	// Output: 1

	// Input: s = "pwekew"
	// Output: 4
	
	public static int longestSubstring(String s) {
		HashSet<Character> set = new HashSet<>();
		
		int j = 0;
		int max = Integer.MIN_VALUE;
		set.add(s.charAt(j));
		
		for(int i = 1; i < s.length(); i++) {
			if(set.contains(s.charAt(i))) {
				while(j < i && set.contains(s.charAt(i))) {
					set.remove(s.charAt(j));
					j++;
				}
				set.add(s.charAt(i));
			}else {
				set.add(s.charAt(i));
				//max = Math.max(max, set.size());
			}
			max = Math.max(max, set.size());
		}
		
		return max;
	}

}
