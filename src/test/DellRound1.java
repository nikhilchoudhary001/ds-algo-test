package test;

import java.util.Stack;

public class DellRound1 {

	public static void main(String[] args) {
		String input = "}{";
		//String input = "((){})[]{";
		
		boolean flag = true;
				
		
		Stack<Character> s = new Stack<>();
		
		for(char c : input.toCharArray()) {
			//System.out.println("Nikhil" + c);
			if(c == '(' || c == '{' || c == '[') {
				s.push(c); // ( {
				continue;
			}
			
			if(c == ')') {
				//System.out.println("Inside ");
				if(!s.isEmpty() && s.peek() == '(') {
					s.pop();
				}else {
					flag = false;
					break;
				}
			}else if(c == '}') {
				if(!s.isEmpty() && s.peek() == '{') {
					s.pop();
				}else {
					flag = false;
					break;
				}
			}else if( c == ']') {
				if(!s.isEmpty() && s.peek() == '[') {
					s.pop();
				}else {
					flag = false;
					break;
				}
			}
		}
		
		if(!flag) {
			System.out.println("Not a valid input");
		} else if(s.size() == 0) {
			System.out.println("Valid input");
		}else {
			System.out.println("Not Valid input");
		}
		

	}

}




