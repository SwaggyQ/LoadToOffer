package com.sugu.solution.at20200723;

/**
 * @author: Gu Quanye
 * @Date: 2020/7/23 9:13 下午
 * @Number: 64
 * @Link: https://leetcode-cn.com/problems/minimum-path-sum/
 */
public class 最小路径和64 {

    public int minPathSum(int[][] grid) {
        if(grid == null || grid.length == 0){
            return 0;
        }
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        dp[0][0] = grid[0][0];
        for(int i = 1;i<m ;i++){
            dp[0][i] = dp[0][i] + grid[0][i-1];
            System.out.println(dp[0][i]);
        }
        for(int i = 1;i<m;i++){
            for(int j=0;j<n;j++){
                if(j == 0){
                    dp[i][j] = dp[i-1][j] + grid[i][j];
                }else {
                    dp[i][j] = Math.min(dp[i-1][j],dp[i][j-1]) + grid[i][j];
                }
            }
        }
        return dp[m-1][n-1];
    }
}
