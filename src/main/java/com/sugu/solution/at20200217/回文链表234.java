package com.sugu.solution.at20200217;

import com.sugu.solution.base.ListNode;

/**
 * @author: Gu Quanye
 * @Date: 2020/2/12 12:38 下午
 * @Number: 234
 * @Link: https://leetcode-cn.com/problems/palindrome-linked-list/
 */
public class 回文链表234 {

    public boolean isPalindrome(ListNode head) {
        if (head == null){
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



    // 20200217 Review
    public boolean isPalindrome1(ListNode head) {
        if(head == null){
            return true;
        }
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode middleHead = reverseList(slow);
        while (middleHead != null && head != null){
            if(middleHead.val == head.val){
                middleHead = middleHead.next;
                head = head.next;
            }else {
                return false;
            }
        }
        return true;
    }

    // 20200217 Review
    public ListNode reverseList(ListNode head){
        if(head == null || head.next == null) {
            return head;
        }
        ListNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }
}
