package com.leetcode.problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParantheses {

	public static void main(String[] args) {

		
		String s = "[((){}[()])]";
		//String s = "()(){}[]()";
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
		
		//System.out.println(map.get('('));
		
		for (int i=0; i<cArr.length; i++) {
			System.out.println("----------------------");
			System.out.println(i);
			//System.out.println(cArr[i] +"  "+ map.get(cArr[i]));
			if(i > 0) {
				if(map.get(cArr[i]) == null) {
					if(map.get(stack.peek()) == cArr[i]) {
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
			System.out.println("Current stack: "+stack);
		}
		
		if(stack.isEmpty()) {
			valid = true;
		}
		System.out.println(stack);
		
		return valid;
    }
}
