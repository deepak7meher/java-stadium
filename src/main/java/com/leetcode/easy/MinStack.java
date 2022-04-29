package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/min-stack/
public class MinStack {

	List<Integer> list;
	public static void main(String[] args) {

		MinStack minStack = new MinStack();
		
		minStack.push(3);
		minStack.push(15);
		minStack.push(9);
		minStack.push(2);
		minStack.push(22);
		System.out.println(minStack.top());
		minStack.pop();
		System.out.println(minStack.top());
		System.out.println(minStack.getMin());
	}

	
	public MinStack() {
		
		list = new ArrayList<Integer>();
        
    }
    
    public void push(int val) {
        
    	list.add(val);
    }
    
    public void pop() {
        
    	list.remove(list.size()-1);
    }
    
    public int top() {
    	
    	return list.get(list.size()-1);
    }
    
    public int getMin() {
    	
    	int min = list.get(0);
    	for(int i=0; i<list.size(); i++) {
    		if(list.get(i) < min) {
    			min = list.get(i);
    		}
    	}
    	return min;
    }
}
