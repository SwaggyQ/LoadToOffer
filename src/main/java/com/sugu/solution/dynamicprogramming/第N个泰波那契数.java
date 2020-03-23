package com.sugu.solution.dynamicprogramming;

import java.util.HashMap;

/**
 * @author: Gu Quanye
 * @Date: 2020/3/23 2:53 下午
 * @Number: 1137
 * @Link: https://leetcode-cn.com/problems/n-th-tribonacci-number/
 */
public class 第N个泰波那契数 {

    private HashMap<Integer,Integer> map = new HashMap<>();
    public int tribonacci(int n) {
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 1;
        }
        if (map.containsKey(n)){
            return map.get(n);
        }else {
            int x = tribonacci(n-1) + tribonacci(n-2)+tribonacci(n-3);
            map.put(n,x);
            return x;
        }
    }
}
