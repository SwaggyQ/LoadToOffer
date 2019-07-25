package com.sugu.solution;

/**
 * @author: create by sugu
 * @date:2019/7/25
 * @link:https://www.nowcoder.com/practice/9f3231a991af4f55b95579b44b7a01ba?tpId=13&tqId=11159&tPage=1&rp=1&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking
 */
public class MinNumberInRotateArray {
    public int minNumberInRotateArray(int [] array) {
        if (array.length == 0)
            return 0;
        int low = 0;
        int high = array.length -1 ;
        int index = -1;
        while(array[low] >= array[high]){
            if(high - low == 1){
                index = high;
                break;
            }
            index = low + (high - low) / 2;
            if(array[index] > array[high]){
                low = index;
            }
            if(array[index] < array[low]){
                high = index;
            }
        }
        return array[index];
    }
}
