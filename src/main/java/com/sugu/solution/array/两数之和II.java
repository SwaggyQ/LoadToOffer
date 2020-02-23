package com.sugu.solution.array;

/**
 * @author: Gu Quanye
 * @Date: 2020/2/23 8:50 下午
 * @Number: 167
 * @Link: https://leetcode-cn.com/problems/two-sum-ii-input-array-is-sorted/submissions/
 */
public class 两数之和II {
    public int[] twoSum(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length -1;
        int[] res = new int[2];
        while (low < high){
            int val = numbers[low] + numbers[high];
            if(val < target){
                low ++;
            }else if (val > target){
                high--;
            }else{
                res[0] = low +1;
                res[1] = high + 1;
                return res;
            }
        }
        return res;
    }
}
