package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParantheses {

	public static void main(String[] args) {

		
		//String s = "[((){}[()])]";
		//String s = "()(){}[]()";
		//String s = "([)]";
		String s = "(){}}{";
		boolean valid = isValid(s);
		System.out.println(valid);
	}

	
	public static boolean isValid(String s) {
		
		boolean valid = false;
		
		char[] cArr = s.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		
		Map<Character, Character> map = new HashMap<Character, Character>();
		map.put('(', ')');
		map.put('{', '}');
		map.put('[', ']');
				
		for (int i=0; i<cArr.length; i++) {

			if(i > 0) {
				if(map.get(cArr[i]) == null) {
					char c = ' ';
					if(!stack.isEmpty() && map.get(stack.peek()) != null) {
						c = map.get(stack.peek()).charValue();
					} 
					
					if(!stack.isEmpty() && cArr[i] == c) {
						stack.pop();
					} else {
						stack.push(cArr[i]);
					}
				} else {
					stack.push(cArr[i]);
				}
			} else {
				stack.push(cArr[i]);
			}
		}
		
		if(stack.isEmpty()) {
			valid = true;
		}
		
		return valid;
    }
}
