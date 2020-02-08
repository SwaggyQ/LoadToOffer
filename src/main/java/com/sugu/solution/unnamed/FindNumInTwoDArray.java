package com.sugu.solution.unnamed;

/**
 * @author: create by sugu
 * @date:2019/7/25
 * @link: https://www.nowcoder.com/practice/abc3fe2ce8e146608e868a70efebf62e?tpId=13&tqId=11154&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class FindNumInTwoDArray {
    public boolean Find(int target, int [][] array) {
        if(array == null || array.length ==0 || array[0].length == 0) return false;
        int len = array[0].length;
        int height = array.length;
        for(int i = 0; i< height; i++){
            if(array[i][0] <= target && target <= array[i][len-1]){
                int low = 0;
                int high = len-1;
                while(low <= high){
                    int index = (low + high) / 2;
                    int num = array[i][index];
                    if(num < target){
                        low = index + 1;
                    }else if(num > target){
                        high = index - 1;
                    }else {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
