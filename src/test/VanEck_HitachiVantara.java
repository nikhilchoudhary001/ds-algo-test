package test;

import java.util.HashMap;
import java.util.Map;

// Ctrl + Shift + O for auto generating dependency

public class VanEck_HitachiVantara {

	public static void main(String[] args) {
		// 0, 0, 1, 0, 2, 0, 2, 2, 1, 6, 0, 5, 0, 2, 6, 5, 4, 0, 5 … 
		
		int curr = 0;
		Map<Integer, Integer> map = new HashMap<>();
		//map.put(curr, 0);
		
		System.out.print("0" + " ");
		int index = 0;
		
		while(index < 20) { // index = 4, curr = 2
			if(map.containsKey(curr) && index - map.get(curr) != 0) {
				int temp = index - map.get(curr); // 2
				System.out.print(temp + " ");
				map.put(curr, index);
				curr = temp;
			} else {
				System.out.print("0" + " ");
				map.put(curr, index); 
				curr = 0;
			}
			index++;
		}
	}
	
	// 0, 0, 1, 0, 2
//	0 - 3
//	1 - 2

}
