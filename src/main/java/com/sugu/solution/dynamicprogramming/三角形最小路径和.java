package com.sugu.solution.dynamicprogramming;

import java.util.List;

/**
 * @author: Gu Quanye
 * @Date: 2020/3/23 5:05 下午
 * @Number: 120
 * @Link: https://leetcode-cn.com/problems/triangle/
 */
public class 三角形最小路径和  {

    public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle == null){
            return 0;
        }
        int m = triangle.size();
        int n = triangle.get(m-1).size();
        int[][] dp = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<i+1;j++){
                if(i == 0 && j == 0){
                    dp[i][j] = triangle.get(0).get(0);
                }else if(j == 0){
                    dp[i][j] = triangle.get(i).get(j) + dp[i-1][j];
                }else if(i != 0 & j != 0){
                    if(j < i){
                        dp[i][j] = triangle.get(i).get(j) + Math.min(dp[i-1][j],dp[i-1][j-1]);
                    }else if(j == i){
                        dp[i][j] = triangle.get(i).get(j) + dp[i-1][j-1];
                    }
                }
            }
        }
        int min = Integer.MAX_VALUE;
        for(int i: dp[m-1]){
            min = Math.min(i,min);
        }
        return min;
    }
}
