package com.sugu.solution.at20200719;

/**
 * @author: Gu Quanye
 * @Date: 2020/7/19 10:26 上午
 * @Number: 35
 * @Link: https://leetcode-cn.com/problems/search-insert-position/
 */
public class 搜索插入位置35 {
    public int searchInsert(int[] nums, int target) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int low,high,res;
        low = 0;
        high = nums.length -1 ;
        res = nums.length;
        while(low <= high){
            int mid = (low + high) / 2;
            if(nums[mid] < target){
                low = mid + 1;
            }else if(nums[mid] >= target){
                res = mid;
                high = mid -1;
            }
        }
        return res;
    }
}
