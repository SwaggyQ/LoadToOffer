package com.sugu.solution.linkedlist;

import com.sugu.solution.base.ListNode;

/**
 * @author: Gu Quanye
 * @Date: 2020/2/12 12:30 下午
 * @Number: 203
 * @Link: https://leetcode-cn.com/problems/remove-linked-list-elements/submissions/
 */
public class 移除链表元素 {

    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy;
        while(head != null){
            if(head.val == val){
                curr.next = head.next;
            }else {
                curr = head;
            }
            head = head.next;
        }
        return dummy.next;
    }
}
