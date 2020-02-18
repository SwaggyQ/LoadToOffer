package com.sugu.solution.array;

/**
 * @author: Gu Quanye
 * @Date: 2020/2/18 2:13 下午
 * @Number: 1351
 * @Link: https://leetcode-cn.com/problems/count-negative-numbers-in-a-sorted-matrix/
 */
public class 统计有序矩阵中的负数 {

    public int countNegatives(int[][] grid) {
        if (grid.length == 0){
            return 0;
        }
        int cnt = 0;
        int m = grid.length;
        int n = grid[0].length;
        for (int i = 0 ; i < m ; i++ ){
            for ( int j = 0 ;j < n ; j++){
                int val = grid[i][j];
                if (val < 0 ){
                    cnt = cnt + (n - j + 1);
                    break;
                }
            }
        }
        return cnt;
    }


    public int countNegatives1(int[][] grid) {
        if (grid.length == 0){
            return 0;
        }
        int cnt = 0;
        int m = grid.length;
        int n = grid[0].length;
        int i = 0;
        int j = n - 1;
        while (i < m && j>=0){
            if (grid[i][j] < 0){
                cnt = cnt + m - i;
                j--;
            }else {
                i++;
            }
        }
        return cnt;
    }

}
