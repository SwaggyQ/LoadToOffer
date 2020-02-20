package com.sugu.solution.at20200220;

/**
 * @author: Gu Quanye
 * @Date: 2020/2/20 12:16 下午
 * @Number: 27
 * @Link: https://leetcode-cn.com/problems/remove-element/
 */
public class 移除元素 {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0;i<nums.length;i++){
            if(nums[i] != val){
                if(i != k){
                    nums[k] = nums[i];
                }
                k++;
            }
        }
        return k;
    }
}
