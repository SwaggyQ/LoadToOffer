package com.sugu.solution.array;

/**
 * @author: Gu Quanye
 * @Date: 2020/2/20 12:28 下午
 * @Number: 80
 * @Link: https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array-ii/
 */
public class 删除排序数组中的重复项II {

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,1,2,3,3};
        removeDuplicates(nums);
    }
    public static int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int k = 1;
        int cache = nums[0];
        int cnt = 1;
        for (int i = 1;i<nums.length;i++){
            if (nums[i] == cache){
                if(cnt < 2){
                    nums[k] = nums[i];
                    k++;
                    cnt++;
                }
            }
            if (nums[i] != cache){
                nums[k] = nums[i];
                k++;
                cache = nums[i];
                cnt = 1;
            }
        }
        return k;
    }
}
