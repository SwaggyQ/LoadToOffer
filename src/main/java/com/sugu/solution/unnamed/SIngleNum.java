package com.sugu.solution.unnamed;

/**
 * @author: create by sugu
 * @date:2019/8/15
 * @link:
 */
public class SIngleNum {
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{2,2,1}));
    }
    public static int singleNumber(int[] nums) {
        int res = nums[0];
        for(int i =1;i<nums.length;i++){
            res ^= nums[i];
        }
        return res;
    }

}
