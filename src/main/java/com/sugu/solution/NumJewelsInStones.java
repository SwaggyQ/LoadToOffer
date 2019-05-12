package com.sugu.solution;

/**
 * 题目描述
 * 给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。 S 中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。
 * 链接:
 https://leetcode-cn.com/problems/jewels-and-stones/
 */
public class NumJewelsInStones {
    public int numJewelsInStones(String J, String S) {
        int cnt = 0;
        for(char c : S.toCharArray()){
            if(J.indexOf(c) != -1){
                cnt++;
            }
        }
        return cnt;
    }
}
