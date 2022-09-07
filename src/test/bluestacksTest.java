package test;

import java.util.HashSet;

public class bluestacksTest {

	public static void main(String[] args) {
		String input = "SAiol rErtyu"; // 
		//String input = "Sailor"; 
		
		int i = 0;
		int j = input.length() - 1;
		
		HashSet<Character> set = new HashSet<>();
		set.add('a');
		set.add('e');
		set.add('i');
		set.add('o');
		set.add('u');
		while(i < j) { // i = 1 ; j = 4
//			while(!set.contains(Character.toLowerCase(input.charAt(i)))) {
//				i++;
//			}	
//			while(!set.contains(Character.toLowerCase(input.charAt(j)))) {
//				j--;
//			}	
			
			// Can also covert uppercase to lowercase like below -
//			char a = 'a';
//			a -= 32;
//			System.out.println("a is " + a); //a is A
			if(set.contains(Character.toLowerCase(input.charAt(i))) && set.contains(Character.toLowerCase(input.charAt(j)))) {
				input = swap(input, i, j); // input = Soilar
				i++;
				j--;
				//continue;
			}
			
			if(!set.contains(Character.toLowerCase(input.charAt(i))))
			i++;
			
			if(!set.contains(Character.toLowerCase(input.charAt(j))))
			j--;
		}
		
		System.out.println("New string is " + input);
	}
	
	static String swap(String input, int i, int j) {
		StringBuilder string = new StringBuilder(input);
		char temp = input.charAt(i);
		
		// input = input.substring(0, i) + input.charAt(j) + input.substring(i+1, input.length());
		string.setCharAt(i, input.charAt(j));
		string.setCharAt(j, temp);
	
		return string.toString();
	}
	
	

}
