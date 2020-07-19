package com.sugu.solution.at20200701;

/**
 * @author: Gu Quanye
 * @Date: 2020/7/1 7:16 下午
 * @Number: 718
 * @Link: https://leetcode-cn.com/problems/maximum-length-of-repeated-subarray/
 */
public class 最长重复子数组718 {

    public int findLength(int[] A, int[] B) {
        int m = A.length;
        int n = B.length;
        int[][] res = new int[m][n];
        for(int j = 0;j<n;j++){
            if(A[0] == B[j]){
                res[0][j] = 1;
            }else {
                res[0][j] = 0;
            }
        }
        for(int i = 1;i<m;i++){
            for(int j = 0;j<n;j++){
                if(A[i] == B[j]){
                    if(j == 0){
                        res[i][j] = 1;
                    }else {
                        res[i][j] = Math.max(res[i-1][j-1] + 1,res[i-1][j]);
                    }
                }else {
                    res[i][j] = res[i-1][j];
                }
            }
        }
        int[] tmp = res[m-1];
        int cnt = Integer.MIN_VALUE;
        for (int i:tmp){
            cnt = Math.max(cnt,i);
        }
        return cnt;
    }
}
