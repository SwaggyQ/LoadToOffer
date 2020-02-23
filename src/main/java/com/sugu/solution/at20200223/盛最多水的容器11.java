package com.sugu.solution.at20200223;

/**
 * @author: Gu Quanye
 * @Date: 2020/2/23 9:19 下午
 * @Number: 11
 * @Link: https://leetcode-cn.com/problems/container-with-most-water/
 */
public class 盛最多水的容器11 {

    public int maxArea(int[] height) {
        int maxArea = 0;
        int low = 0;
        int high = height.length - 1;
        while (low < high){
            maxArea = Math.max(( high - low)  * Math.min(height[low], height[high]),maxArea);
            if(height[low] < height[high]){
                low++;
            }else{
                high--;
            }
        }
        return maxArea;
    }
}
