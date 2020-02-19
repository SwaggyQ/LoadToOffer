package com.sugu.solution.array;

import java.util.LinkedList;
import java.util.List;

/**
 * @author: Gu Quanye
 * @Date: 2020/2/19 3:28 下午
 * @Number: 118
 * @Link: https://leetcode-cn.com/problems/pascals-triangle/
 */
public class 杨辉三角 {

    public static void main(String[] args) {
        generate(5);
    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new LinkedList<>();
        for (int i = 1;i <= numRows;i++){
            List<Integer> tmp = new LinkedList<>();
            List<Integer> upLevel = new LinkedList<>();
            if (i > 1){
                upLevel = res.get(i-2);
            }
            for (int j = 0; j < i;j++){
                if(j == 0 || j == i-1){
                    tmp.add(1);
                }else {
                    tmp.add(j,upLevel.get(j - 1) + upLevel.get(j));
                }
            }
            res.add(tmp);
        }
        return res;
    }
}
