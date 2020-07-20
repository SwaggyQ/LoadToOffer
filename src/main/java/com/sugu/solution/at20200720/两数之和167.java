package com.sugu.solution.at20200720;

/**
 * @author: Gu Quanye
 * @Date: 2020/7/20 9:17 下午
 * @Number: 167
 * @Link: https://leetcode-cn.com/problems/two-sum-ii-input-array-is-sorted/
 */
public class 两数之和167 {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        if(nums == null || nums.length == 0){
            return res;
        }
        int left = 0;
        int right = nums.length;
        while(left < right){
            int tmp = left + right;
            if(tmp > target){
                right--;
            }else if(tmp < target){
                left ++;
            }else {
                break;
            }
        }
        res[0] = left;
        res[1] = right;
        return res;
    }
}
