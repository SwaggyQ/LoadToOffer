package com.sugu.solution.unnamed;

import java.util.HashMap;

/**
 * 题目描述
 * 给定一个整数数组和一个整数 k，判断数组中是否存在两个不同的索引 i 和 j，使得 nums [i] = nums [j]，并且 i 和 j 的差的绝对值最大为 k。
 * 链接:
 https://leetcode-cn.com/problems/contains-duplicate-ii/
 */
public class ContainsNearbyDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i = 0;i<nums.length;i++){
            for(int del = 1; del<=k && i + del < nums.length;del++){
                if(nums[i] == nums[i + del])
                    return true;
            }
        }
        return false;
    }

    public boolean containsNearbyDuplicate2(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            int val = nums[i];
            int oldI = map.getOrDefault(val,Integer.MAX_VALUE);
            if(Math.abs(i - oldI) <= k) return true;
            map.put(val,i);
        }
        return false;
    }
}
