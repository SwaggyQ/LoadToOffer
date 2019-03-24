package com.sugu.solution;


/**
 * 题目描述
 * HZ偶尔会拿些专业问题来忽悠那些非计算机专业的同学。今天测试组开完会后,他又发话了:在古老的一维模式识别中,
 * 常常需要计算连续子向量的最大和,当向量全为正数的时候,问题很好解决。但是,如果向量中包含负数,是否应该包含某个负数,
 * 并期望旁边的正数会弥补它呢？例如:{6,-3,-2,7,-15,1,2,2},连续子向量的最大和为8(从第0个开始,到第3个为止)。
 * 给一个数组，返回它的最大连续子序列的和，你会不会被他忽悠住？(子向量的长度至少是1)
 * 链接:
 https://www.nowcoder.com/practice/459bd355da1549fa8a49e350bf3df484?tpId=13&tqId=11183&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class FindGreatestSumOfSubArray {
    public int FindGreatestSumOfSubArray(int[] array) {
        int total = array[0];
        int maxSum = array[0];
        for(int i = 1;i<array.length;i++){
            if(total>0){
                total+=array[i];
            }else {
                total = array[i];
            }
            maxSum = Math.max(total,maxSum);
        }
        return maxSum;
    }


    public int FindGreatestSumOfSubArray1(int[] array) {
        int low = 0;
        int high = 1;
        int len = array.length;
        int max = array[0];
        int sum = array[0];
        while(high < len){
            if(sum > 0){
                sum += array[high];
                high ++;
            }else{
                low = high ;
                high = low+1;
                sum = array[low];
            }
            max = Math.max(sum,max);
        }
        return max;
    }
}
