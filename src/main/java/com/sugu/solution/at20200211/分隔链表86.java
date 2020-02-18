package com.sugu.solution.at20200211;

import com.sugu.solution.base.ListNode;

/**
 * @author: Gu Quanye
 * @Date: 2020/2/11 3:20 下午
 * @Number: 86
 * @Link: https://leetcode-cn.com/problems/partition-list/
 */
public class 分隔链表86 {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(2);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(2);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        partition(node1,3);
    }
    public static ListNode partition(ListNode head, int x) {
        if (head == null){
            return null;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode more = new ListNode(0);
        ListNode moreHead = more;
        ListNode less = new ListNode(0);
        ListNode lessHead = less;


        while( head != null) {
            if(head.val < x){
                less.next = head;
                less = less.next;
            }else {
                more.next = head;
                more = more.next;
            }
            head = head.next;
        }
        more.next = null;
        less.next = moreHead.next;

        return lessHead.next;
    }

}
