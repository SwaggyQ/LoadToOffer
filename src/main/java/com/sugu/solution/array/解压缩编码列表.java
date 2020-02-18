package com.sugu.solution.array;

/**
 * @author: Gu Quanye
 * @Date: 2020/2/18 2:02 下午
 * @Number: https://leetcode-cn.com/problems/decompress-run-length-encoded-list/
 * @Link: 1313
 */
public class 解压缩编码列表 {
    public int[] decompressRLElist(int[] nums) {
        int totalSize = 0;
        int len = nums.length;
        for(int i = 0;i<len;i = i+2){
            totalSize += nums[i];
        }
        int[] res = new int[totalSize];
        int index = 0;
        for(int i = 0;i<len;i = i+2){
            int size = nums[i];
            int num = nums[i+1];
            for(int j = 0;j<size;j++){
                res[index++] = num;
            }
        }
        return res;
    }
}
