package com.sugu.solution.at20200719;

/**
 * @author: Gu Quanye
 * @Date: 2020/7/19 10:59 上午
 * @Number: 312
 * @Link: https://leetcode-cn.com/problems/burst-balloons/
 */
public class 戳气球312 {

    public int maxCoins(int[] nums) {
        int len = nums.length;
        int[][] dp = new int[len+2][len+2];
        int[] res = new int[len + 2];
        res[0] = 1;
        res[res.length -1] = 1;
        for(int i = 0;i<len-1;i++){
            res[i+1] = nums[i];
        }
        return solve(0,len-1);
    }

    private int solve(int left, int right) {
        return 0;
    }
}
