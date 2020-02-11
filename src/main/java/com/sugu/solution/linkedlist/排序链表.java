package com.sugu.solution.linkedlist;

import com.sugu.solution.base.ListNode;

/**
 * @author: Gu Quanye
 * @Date: 2020/2/10 12:37 下午
 * @Number: 148
 * @Link: https://leetcode-cn.com/problems/sort-list/
 */
public class 排序链表  {

    public ListNode sortList(ListNode head) {
        if(head == null){
            return null;
        }
        return helper(head,head.next);
    }

    public ListNode helper(ListNode l1, ListNode l2){
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        if(l1.val > l2.val){
            ListNode next = helper(l1,l2.next);
            return l2;
        }else {
            ListNode next = helper(l1.next,l2);
            return l1;
        }
    }
}
