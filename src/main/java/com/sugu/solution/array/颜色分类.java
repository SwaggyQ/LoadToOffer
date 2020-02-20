package com.sugu.solution.array;

/**
 * @author: Gu Quanye
 * @Date: 2020/2/20 1:16 下午
 * @Number: 75
 * @Link: https://leetcode-cn.com/problems/sort-colors/
 */
public class 颜色分类 {

    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
    }

    // bad solution
    public static void sortColors(int[] nums) {
        // 整数 0、 1 和 2 分别表示红色、白色和蓝色
        int redCnt = 0;
        int whiteCnt = 0;
        int blueCnt = 0;
        for(int i:nums){
            if(i == 0){
                redCnt++;
            }else if(i == 1){
                whiteCnt++;
            }else if(i == 2){
                blueCnt++;
            }
        }
        int redIndex = 0;
        int whiteIndex = redCnt;
        int blueIndex = redCnt + whiteCnt;
        for(int i = 0;i<nums.length;){
            if(nums[i] == 0){
                if(i<redCnt && i>=0){
                    i++;
                    continue;
                }
                int tmp = nums[i];
                nums[i] = nums[redIndex];
                nums[redIndex++] = tmp;
            }else if(nums[i] == 1){
                if(i<whiteIndex && i>=redCnt){
                    i++;
                    continue;
                }
                int tmp = nums[i];
                nums[i] = nums[whiteIndex];
                nums[whiteIndex++] = tmp;
            }else if(nums[i] == 2){
                if(i>=whiteIndex){
                    i++;
                    continue;
                }
                int tmp = nums[i];
                nums[i] = nums[blueIndex];
                nums[blueIndex++] = tmp;
            }
            int a=  1;
        }
    }
}
