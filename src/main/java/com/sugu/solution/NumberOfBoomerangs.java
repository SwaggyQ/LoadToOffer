package com.sugu.solution;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 题目描述
 * 给定平面上 n 对不同的点，“回旋镖” 是由点表示的元组 (i, j, k) ，其中 i 和 j 之间的距离和 i 和 k 之间的距离相等（需要考虑元组的顺序）。
 * 链接:
 https://leetcode-cn.com/problems/number-of-boomerangs/
 */
public class NumberOfBoomerangs {

    public int numberOfBoomerangs(int[][] points) {
        int cnt = 0;
        for(int i=0;i<points.length;i++){
            HashMap<Double,Integer> rangePerCol = new HashMap<>();
            for(int j=0;j<points.length;j++){
                if(j == i) continue;
                double ra = helper(points[i],points[j]);
                int ai = rangePerCol.getOrDefault(ra,0) + 1;
                rangePerCol.put(ra,ai);
            }
            for(Double d:rangePerCol.keySet()){
                int x = rangePerCol.get(d);
                cnt += x*(x-1);
            }
        }

        return cnt;
    }

    private double helper(int[] point, int[] point1) {
        int h = point1[1] - point[1];
        int d = point1[0] - point[0];
        return Math.sqrt(Math.pow(h,2) + Math.pow(d,2));
    }
}
