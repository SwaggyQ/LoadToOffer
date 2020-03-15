package com.sugu.solution.at20200315;

/**
 * @author: Gu Quanye
 * @Date: 2020/3/15 11:42 下午
 * @Number: 509
 * @Link: https://leetcode-cn.com/problems/fibonacci-number/
 */
public class 斐波那契数509 {

    // non dp
    public int fib(int n) {
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
