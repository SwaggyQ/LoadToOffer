package com.sugu.solution.at20200302;

/**
 * @author: Gu Quanye
 * @Date: 2020/3/2 1:29 下午
 * @Number: 485
 * @Link: https://leetcode-cn.com/problems/max-consecutive-ones/
 */
public class 最大连续1的个数485 {

    // [1,1,0,1,1,1]
    public int findMaxConsecutiveOnes(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int len = nums.length;
        int left = 0;
        int right = 0;
        int cnt = 0;
        while (right < len){
            if(nums[right] == 1){
                right++;
            }else {
                cnt = Math.max(cnt , right-left);
                left = right + 1;
                right++;
            }
        }
        cnt = Math.max(cnt , right-left);
        return cnt;
    }
}
