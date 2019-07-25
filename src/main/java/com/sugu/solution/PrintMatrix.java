package com.sugu.solution;

import java.util.ArrayList;

/**
 * @author: create by sugu
 * @date:2019/7/25
 * @link:https://www.nowcoder.com/practice/9b4c81a02cd34f76be2659fa0d54342a?tpId=13&tqId=11172&tPage=1&rp=1&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking
 */
public class PrintMatrix {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return null;
        ArrayList<Integer> result = new ArrayList<Integer>();
        int len = matrix.length;
        int height = matrix[0].length;
        int left = 0;
        int right = height -1;
        int top = 0;
        int bottom = len -1;
        while (true){
            for(int i = left ; i<=right;i++){
                result.add(matrix[top][i]);
            }
            if(++top > bottom) break;
            for(int i = top; i<= bottom ;i++){
                result.add(matrix[i][right]);
            }
            if(--right < left) break;
            for(int i = right; i >=left; i--){
                result.add(matrix[bottom][i]);
            }
            if(--bottom < top) break;
            for(int i = bottom; i>=top;i--){
                result.add(matrix[i][left]);
            }
            if(++left > right) break;
        }
        return result;
    }
}
