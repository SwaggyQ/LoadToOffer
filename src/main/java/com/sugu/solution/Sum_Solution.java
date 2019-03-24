package com.sugu.solution;


/**
 * 题目描述
 * 求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
 * 链接:
 https://www.nowcoder.com/practice/7a0da8fc483247ff8800059e12d7caf1?tpId=13&tqId=11200&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class Sum_Solution {
    public int Sum_Solution(int n) {
        int sum = n;
        boolean flag = sum>0 && (sum+=Sum_Solution(n-1))>0;
        return sum;
    }
}
