package com.leetcode.easy;

public class ExcelSheetColumnNumber {

	public static void main(String[] args) {

		int colNum = titleToNumber("AB");
		System.out.println(colNum);
	}

	public static int titleToNumber(String columnTitle) { 
        int l = columnTitle.length();
        int result = 0;

        for(int i=0; i<l; i++) {
            int tempValue = (columnTitle.charAt(l-i-1) - 'A') +1;
            System.out.println(tempValue);
            result = result + (int)Math.pow(26,i)*tempValue;
        }
        
        return result;
    }
}
