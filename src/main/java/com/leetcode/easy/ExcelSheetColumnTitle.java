package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/excel-sheet-column-title/
public class ExcelSheetColumnTitle {

	public static void main(String[] args) {

		
		String colTitle = convertToTitle(701);
		System.out.println(colTitle);
		
		
	}
	
	public static String convertToTitle(int columnNumber) {
        
		StringBuilder sb = new StringBuilder();

		while(columnNumber > 0) {
			int rem = columnNumber%26;
			if(rem == 0) {
				rem = 26;
			}
			
			char ch = (char)('A'+(rem-1));
			sb.append(ch);
			
			columnNumber = columnNumber - rem;
			columnNumber = columnNumber/26;
		}
		sb.reverse();
		
		return sb.toString();
    }

}
