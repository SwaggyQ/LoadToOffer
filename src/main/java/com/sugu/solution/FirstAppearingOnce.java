package com.sugu.solution;

import java.util.HashSet;

/**
 * 题目描述
 * 请实现一个函数用来找出字符流中第一个只出现一次的字符。例如，当从字符流中只读出前两个字符"go"时，第一个只出现一次的字符是"g"。当从该字符流中读出前六个字符“google"时，第一个只出现一次的字符是"l"。
 * 链接:
 https://www.nowcoder.com/practice/00de97733b8e4f97a3fb5c680ee10720?tpId=13&tqId=11207&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class FirstAppearingOnce {
    private int[] allChars = new int[256];
    StringBuffer s=new StringBuffer();
    public void Insert(char ch)
    {
        int index = (int) ch;
        allChars[index] += 1;
        s.append(ch);
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        for(Character c : s.toString().toCharArray()){
            if(allChars[c] == 1){
                return c;
            }
        }
        return '#';
    }
}
