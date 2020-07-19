package com.sugu.solution.dynamicprogramming;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: Gu Quanye
 * @Date: 2020/3/24 2:24 下午
 * @Number: 343
 * @Link: https://leetcode-cn.com/problems/integer-break/
 */
public class 整数拆分 {

    // bad solution
    private Map<Integer,Integer> map = new HashMap<>();
    public int integerBreak1(int n) {
        if(n == 1){
            return 1;
        }
        return helper(n);
    }

    public int helper(int n){
        if(n == 1){
            return 1;
        }
        if(!map.containsKey(n)){
            int res = -1;
            for(int i = 1;i<n;i++){
                res = Math.max(res,Math.max(i*(n-i) , helper(n-i) * i));
            }
            map.put(n,res);
        }

        return map.get(n);
    }


    public static void main(String[] args) {
        System.out.println(integerBreak(7));
    }
    public static int integerBreak(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;
        for(int i = 2;i<=n;i++){
            for(int j = 1;j<i;j++){
                System.out.println("i : [" + i + "] j : [" + j);
                System.out.println(dp[j] * dp[i-j]);
                System.out.println(j * dp[i-j]);

                dp[i] = Math.max(j * dp[i-j], Math.max(dp[i],j*(i-j)));
            }
        }
        return dp[n];
    }
}
