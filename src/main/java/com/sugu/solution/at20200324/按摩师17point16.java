package com.sugu.solution.at20200324;

/**
 * @author: Gu Quanye
 * @Date: 2020/3/24 11:28 上午
 * @Number: 面试题 17.16.
 * @Link: https://leetcode-cn.com/problems/the-masseuse-lcci/
 */
public class 按摩师17point16 {

    // bad solution
    public int massage1(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        if(nums.length == 1){
            return nums[0];
        }
        if(nums.length == 2){
            return Math.max(nums[0],nums[1]);
        }
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = nums[1];
        for(int i = 3;i<nums.length;i++){
            int max = Integer.MIN_VALUE;
            for(int j = 0;j<i;j++){
                max = Math.max(max,dp[j]);
            }
            dp[i] = max + nums[i];
        }
        return Math.max(dp[nums.length -1] ,dp[nums.length -2]);
    }

    public int massage(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        if(nums.length == 1){
            return nums[0];
        }
        if(nums.length == 2){
            return Math.max(nums[0],nums[1]);
        }
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[1],nums[0]);
        for(int i = 2;i<nums.length;i++){
            dp[i] = Math.max(dp[i-1],dp[i-2]+nums[i]);
        }
        return dp[nums.length-1];
    }

}
