package com.sugu.solution.array;

/**
 * @author: Gu Quanye
 * @Date: 2020/2/20 12:21 下午
 * @Number: 26
 * @Link: https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
 */
public class 删除排序数组中的重复项 {

    public int removeDuplicates(int[] nums) {
        int k = 1;
        int cache = nums[0];
        for (int i=1;i<nums.length;i++){
            if(nums[i] != cache){
                if( i != k){
                    nums[k] = nums[i];
                }
                k++;
                cache = nums[i];
            }
        }
        return k;

    }
}
