package com.sugu.solution.array;

/**
 * @author: Gu Quanye
 * @Date: 2020/2/18 3:02 下午
 * @Number: 1295
 * @Link: https://leetcode-cn.com/problems/find-numbers-with-even-number-of-digits/
 */
public class 统计位数为偶数的数字 {
    public int findNumbers(int[] nums) {
        int len = nums.length;
        int cnt = 0;
        for (int i=0;i<len;i++){
            int val = nums[i];
            int bits = 1;
            while (val != 0 && val / 10  !=0){
                bits++;
                val = val / 10;
            }
            if (bits % 2 == 0){
                cnt++;
            }
        }
        return cnt;
    }

    public int findNumbers1(int[] nums) {
        int sum = 0;
        for (int i:nums){
            if (Math.log(i) % 2 ==1){
                sum++;
            }
        }
        return sum;
    }

}
