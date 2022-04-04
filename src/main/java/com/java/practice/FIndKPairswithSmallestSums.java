package com.java.practice;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class FIndKPairswithSmallestSums {

	public static void main(String[] args) {
		int[] nums1 = {1,1,2};
		int[] nums2 = {1,2,3};
		System.out.println(kSmallestPairs(nums1, nums2, 3));
	}
	
	public static List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> res = new LinkedList<>();
        if(k <= 0) return res;
        int m = nums1.length, n = nums2.length;
        PriorityQueue<Point> pq = new PriorityQueue<>(m, (a, b) -> nums1[a.x] + nums2[a.y] - nums1[b.x] - nums2[b.y]);

        for(int j = 0; j <= n - 1; j++) {
            pq.offer(new Point(0, j));
        }

        for(int i = 0; i < Math.min(k, ((long)m) * ((long)n)); i++) {
            Point t = pq.poll();
            res.add(Arrays.asList(nums1[t.x], nums2[t.y]));
            if(t.x == m - 1) continue;
            pq.offer(new Point(t.x + 1, t.y));
        }
        return res;
    }
}

class Point {
    int x, y;
    Point (int x, int y) {
        this.x = x;
        this.y = y;
    }
}
