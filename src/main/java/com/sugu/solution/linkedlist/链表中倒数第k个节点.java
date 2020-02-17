package com.sugu.solution.linkedlist;

import com.sugu.solution.base.ListNode;

/**
 * @author: Gu Quanye
 * @Date: 2020/2/17 11:11 下午
 * @Number: 面试题22.
 * @Link: https://leetcode-cn.com/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof/
 */
public class 链表中倒数第k个节点 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        if (head == null){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (k > 0 && fast != null){
            fast = fast.next;
            k = k - 1;
        }
        while (fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
