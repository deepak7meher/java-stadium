package com.java.practice;

public class OppsiteSigns {

	public static void main(String[] args) {
		int x = 101, y = -10;
        if (oppositeSigns(x, y) == true)
            System.out.println("Signs are opposite");
        else
            System.out.println("Signs are not opposite");

	}

    static boolean oppositeSigns(int x, int y)
    {
    	System.out.println(x ^ y);
        return ((x ^ y) < 0);
    }

	
}
