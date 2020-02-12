package com.sugu.solution.linkedlist;

import com.sugu.solution.base.ListNode;

/**
 * @author: Gu Quanye
 * @Date: 2020/2/12 12:38 下午
 * @Number: 234
 * @Link: https://leetcode-cn.com/problems/palindrome-linked-list/
 */
public class 回文链表 {

    public boolean isPalindrome(ListNode head) {
        if( head == null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        while( fast!= null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.val);
        ListNode reverseHead = reverse(slow);
        while(reverseHead != null){
            if(reverseHead.val == head.val){
                continue;
            }else {
                return false;
            }
        }
        return true;
    }

    private ListNode reverse(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode p = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }
}
