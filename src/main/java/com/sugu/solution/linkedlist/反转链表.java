package com.sugu.solution.linkedlist;

import com.sugu.solution.base.ListNode;

/**
 * @author: Gu Quanye
 * @Date: 2020/2/12 4:16 下午
 * @Number: 206
 * @Link: https://leetcode-cn.com/problems/reverse-linked-list/
 */
public class 反转链表 {


    /**
     * 非迭代
     */
    public static ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode pre = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }


    /**
     * 迭代
     */
    public static ListNode reverseList2(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }

    /**
     * 迭代 review
     */
    public static ListNode reverseList3(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode p = reverseList3(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }

    /**
     * 非迭代 review
     */
    public static ListNode reverseList4(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode pre = null;
        while (head != null) {
            ListNode curr = head.next;
            head.next = pre;
            pre = head;
            head = curr;

        }
        return pre;
    }
}
