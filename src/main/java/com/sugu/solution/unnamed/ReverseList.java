package com.sugu.solution.unnamed;

import com.sugu.solution.base.ListNode;

/**
 * 题目描述
 * 输入一个链表，反转链表后，输出新链表的表头。
 * 链接:
 https://www.nowcoder.com/practice/75e878df47f24fdc9dc3e400ec6058ca?tpId=13&tqId=11168&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class ReverseList {
    public ListNode ReverseList(ListNode head) {
        ListNode preHead = null;
        while(head!=null){
            ListNode next = head.next;
            head.next = preHead;
            preHead = head;
            head = next;
        }
        return preHead;
    }
}
