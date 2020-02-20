package com.sugu.solution.array;

/**
 * @author: Gu Quanye
 * @Date: 2020/2/20 12:08 下午
 * @Number: 283
 * @Link: https://leetcode-cn.com/problems/move-zeroes/
 */
public class 移动零 {

    public void moveZeroes(int[] nums) {
        int k = 0;
        for (int i = 0;i<nums.length ;i++){
            if (nums[i] != 0){
                if (i != k){
                    int tmp = nums[i];
                    nums[i] = nums[k];
                    nums[k] = tmp;
                }
                k++;
            }
        }
    }
}
