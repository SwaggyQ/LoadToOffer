package com.sugu.solution;

/**
 * 题目描述
 * 给定一个整数数组，判断数组中是否有两个不同的索引 i 和 j，使得 nums [i] 和 nums [j] 的差的绝对值最大为 t，并且 i 和 j 之间的差的绝对值最大为 ķ。
 * 链接:
 https://leetcode-cn.com/problems/contains-duplicate-iii/
 */
public class ContainsNearbyAlmostDuplicate {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        for(int i = 0;i<nums.length;i++){
            for(int del = 1; del<=k && i + del < nums.length;del++){
                if(Math.abs(Long.valueOf(nums[i]) - Long.valueOf(nums[i + del]))  <= t)
                    return true;
            }
        }
        return false;
    }
}
