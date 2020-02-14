package com.sugu.solution.linkedlist.at20200214;

import com.sugu.solution.base.ListNode;

/**
 * @author: Gu Quanye
 * @Date: 2020/2/14 9:58 上午
 * @Number: 19
 * @Link: https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/
 */
public class 删除链表的倒数第N个节点19 {

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        removeNthFromEnd(node,1);
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null){
            return null;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode fast = head;
        while (n-- > 0){
            fast = fast.next;
        }
        while (fast != null){
            fast = fast.next;
            dummy = dummy.next;
        }
        ListNode curr = dummy.next.next;
        dummy.next = curr;
        return pre.next;
    }


    public static ListNode removeNthFromEnd1(ListNode head, int n) {
        if (head == null){
            return null;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        while (n != 0){
            fast = fast.next;
            n--;
        }
        if (fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummy.next;


    }
}
