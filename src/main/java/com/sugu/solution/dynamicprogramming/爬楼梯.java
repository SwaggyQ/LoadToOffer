package com.sugu.solution.dynamicprogramming;

import java.util.HashMap;

/**
 * @author: Gu Quanye
 * @Date: 2020/3/23 2:40 下午
 * @Number: 70
 * @Link: https://leetcode-cn.com/problems/climbing-stairs/
 */
public class 爬楼梯 {

    private HashMap<Integer,Integer> map = new HashMap<>();
    public int climbStairs(int n) {
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }
        if(map.containsKey(n)){
            return map.get(n);
        }else {
            int x = climbStairs(n - 1) + climbStairs(n - 2);
            map.put(n,x);
            return x;
        }
    }




    public int climbStairs2(int n) {
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }
        int[] arr = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        for(int i = 3;i<=n;i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[n];
    }
}
