package com.sugu.solution.linkedlist;

import com.sugu.solution.base.ListNode;

/**
 * @author: Gu Quanye
 * @Date: 2020/2/17 11:27 下午
 * @Number: 面试题52.
 * @Link: https://leetcode-cn.com/problems/liang-ge-lian-biao-de-di-yi-ge-gong-gong-jie-dian-lcof/
 */
public class 两个链表的第一个公共节点 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null){
            return null;
        }
        ListNode pA = headA;
        ListNode pB = headB;
        while (pA != pB){
            pA = pA == null ? headB:pA.next;
            pB = pB == null ? headA:pB.next;
        }
        return pA;
    }
}
