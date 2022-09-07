package test;

import java.util.HashMap;
import java.util.Map;

//Input: s = "cbaebabacd", p = "abc"
//
//Output: [0,6]
//
//The substring with start index = 0 is "cba", which is an anagram of "abc".
//The substring with start index = 6 is "bac", which is an anagram of "abc".

// https://leetcode.com/problems/find-all-anagrams-in-a-string/
public class EAGamesRound2 {

	public static void main(String[] args) {
		String s = "cbacbabacd"; // 10
		String p = "abc"; //3
		
		//List<Integer> 
		
		Map<Character, Integer> cMap = new HashMap<>();
		
		for(char c : p.toCharArray()) {
			cMap.put(c, cMap.getOrDefault(c, 0) + 1);
		}
		// a - 1 , b - 1 , c -1 = cMap
		
		for(int i = 0; i <= s.length() - p.length() ; i++) { // 0 to 7
			for(int j = i; j < j + p.length(); j++) { // 0 to 2
				if(cMap.containsKey(s.charAt(j))) {
					if(cMap.get(s.charAt(j)) == 1) {
						cMap.remove(s.charAt(j)); // cMap = empty after j = 2
					}else {
						cMap.put(s.charAt(j), cMap.get(s.charAt(j)) - 1);
					}
				}
			}
			
			if(cMap.size() == 0) {
				
			}
			
			for(char c : p.toCharArray()) {
				cMap.put(c, cMap.getOrDefault(c, 0) + 1);
			}
		}
	}

}



// 