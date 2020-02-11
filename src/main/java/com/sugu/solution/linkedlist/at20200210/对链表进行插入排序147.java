package com.sugu.solution.linkedlist.at20200210;

import com.sugu.solution.base.ListNode;

/**
 * @author: Gu Quanye
 * @Date: 2020/2/10 3:57 下午
 * @Number: 147
 * @Link: https://leetcode-cn.com/problems/insertion-sort-list/
 */
public class 对链表进行插入排序147 {

    public static void main(String[] args) {
        ListNode node = new ListNode(2);
        ListNode node1 = new ListNode(1);
        node.next = node1;
        insertionSortList(node);
    }
    public static ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode pre;
        dummy.next = head;
        while (head != null && head.next != null){
            if (head.val < head.next.val){
                head = head.next;
                continue;
            }
            pre = dummy;
            while (pre.next.val < head.next.val){
                pre = pre.next;
            }
            ListNode curr = head.next;
            head.next = curr.next;
            curr.next = pre.next;
            pre.next = curr;
        }
        return dummy.next;
    }
}
