package com.sugu.solution.array;

/**
 * @author: Gu Quanye
 * @Date: 2020/2/23 11:04 下午
 * @Number: 209
 * @Link: https://leetcode-cn.com/problems/minimum-size-subarray-sum/
 */
public class 长度最小的子数组 {

    public int minSubArrayLen(int s, int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int minLen = Integer.MAX_VALUE;
        int l = 0;
        int h = 0;
        int cacheSum = nums[0];
        while ( l<=h && h < nums.length){
            if (cacheSum < s){
                h++;
                if(h<nums.length){
                    cacheSum += nums[h];
                }
            }else{
                minLen = Math.min(minLen,h-l+1);
                if (minLen == 1){
                    return minLen;
                }
                cacheSum -= nums[l];
                l++;
            }
        }
        return minLen > nums.length ? 0 : minLen;
    }
}
