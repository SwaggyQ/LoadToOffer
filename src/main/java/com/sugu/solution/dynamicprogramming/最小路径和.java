package com.sugu.solution.dynamicprogramming;

import java.util.Arrays;

/**
 * @author: Gu Quanye
 * @Date: 2020/3/23 3:26 下午
 * @Number: 64
 * @Link: https://leetcode-cn.com/problems/minimum-path-sum/
 */
public class 最小路径和 {

    // bad soulution
    public int minPathSum2(int[][] grid) {
        if(grid == null){
            return 0;
        }
        int m = grid.length;
        int n = grid[0].length;
        int[][] tmp = new int[m][n];
        int[] ten=new int[n];
        Arrays.fill(ten, -1);
        Arrays.fill(tmp,ten);  //成功
        return helper(m-1,n-1,grid,tmp);
    }
    public int helper(int m, int n, int[][] grid, int[][] tmp){
        if(m == -1 || n == -1){
            return Integer.MAX_VALUE;
        }
        if(m == 0 && n == 0){
            return grid[m][n];
        }
        if(tmp[m][n] == -1) {
            int x = grid[m][n] + Math.min(helper(m - 1, n, grid, tmp), helper(m, n - 1, grid, tmp));
            tmp[m][n] = x;
        }
        return tmp[m][n];
    }



    public int minPathSum(int[][] grid) {
        if(grid == null || grid.length == 0 || grid[0].length == 0){
            return 0;
        }
        int m = grid.length;
        int n = grid[0].length;
        int[][] tmp = new int[m][n];
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(i == 0 &&  j == 0){
                    tmp[i][j] = grid[i][j];
                }else if(i == 0){
                    tmp[i][j] = tmp[0][j-1] + grid[i][j];
                }else if(j == 0){
                    tmp[i][j] = tmp[i-1][0] + grid[i][j];
                }else{
                    tmp[i][j] = Math.min(tmp[i-1][j],tmp[i][j-1]) + grid[i][j];
                }
            }
        }
        return tmp[m-1][n-1];
    }

}
