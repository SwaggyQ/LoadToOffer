package com.sugu.solution.at20200628;

/**
 * @author: Gu Quanye
 * @Date: 2020/6/28 7:21 下午
 * @Number: 209
 * @Link: https://leetcode-cn.com/problems/minimum-size-subarray-sum/
 */
public class 长度最小的子数组209 {
    public static void main(String[] args) {
        int[] num = {2,3,1,2,4,3,3,4,3,3,3,3,3,4,4,3,2,1,3};
        System.out.println(minSubArrayLen(7,num));
    }
    public static int minSubArrayLen(int s, int[] nums) {
        if(nums == null || nums.length == 0 ){
            return 0;
        }
        int low = 0;
        int high = 1;
        int tmp = nums[low];
        int cnt = Integer.MAX_VALUE;
        while(high < nums.length){
            tmp += nums[high];
            if(tmp < s){
                high++;
            }else {
                cnt = Math.min(cnt,(high - low) + 1);
                while(low < high-1){
                    low ++;
                    tmp -= nums[low-1];
                    if(tmp < s){
                        break;
                    }else {
                        cnt = Math.min(cnt, (high - low) + 1);
                        high++;
                    }
                }
            }
        }
        return cnt;
    }
}
