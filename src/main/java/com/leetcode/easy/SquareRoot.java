package com.leetcode.easy;

public class SquareRoot {

	public static void main(String[] args) {

		int result = mySqrt(8);
		System.out.println("Result="+result);
	}

	public static int mySqrt(int x) {
        
        if (x < 2)
            return x;
        int left=0, right = x/2;
        
        while(left <= right){
            int mid = left + (right - left)/2;
            System.out.println("mid="+mid);
            long sqr = (long) mid * mid;
            if (sqr < x)
                left = mid + 1;
            else if (sqr > x)
                right = mid - 1;
            else
                return mid;
        }
        return right;
    }
}
