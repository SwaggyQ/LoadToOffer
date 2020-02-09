package com.sugu.solution.linkedlist;

import com.sugu.solution.base.ListNode;

/**
 * @author: Gu Quanye
 * @Date: 2020/2/9 8:20 下午
 * @Number: 1290
 * @Link: https://leetcode-cn.com/problems/convert-binary-number-in-a-linked-list-to-integer/
 */
public class 二进制链表转整数 {
    public int getDecimalValue(ListNode head) {
        Integer result = 0;
        while (head != null){
            result = result * 2 + head.val;
            head = head.next;
        }
        return result;
    }
}
