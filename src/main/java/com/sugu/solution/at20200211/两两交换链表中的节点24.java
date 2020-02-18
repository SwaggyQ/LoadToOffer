package com.sugu.solution.at20200211;

import com.sugu.solution.base.ListNode;

/**
 * @author: Gu Quanye
 * @Date: 2020/2/11 11:36 上午
 * @Number: 24
 * @Link: https://leetcode-cn.com/problems/swap-nodes-in-pairs/
 */
public class 两两交换链表中的节点24 {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        ListNode node7 = new ListNode(7);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;

        swapPairs(node1);
    }

    // 非递归方法
    public static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        ListNode cacheNode = null;
        while (head != null && head.next != null) {
            ListNode fast = head.next;
            ListNode curr = fast.next;
            head.next = curr;
            fast.next = head;
            if (dummy.next == null) {
                dummy.next = fast;
            } else {
                cacheNode.next = fast;
            }
            cacheNode = head;
            head = head.next;
        }
        return dummy.next;
    }


    // 递归方法
    public static ListNode swapPairs2(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode firstNode = head;
        ListNode secondNode = head.next;
        firstNode.next = swapPairs(secondNode.next);
        secondNode.next = firstNode;
        return secondNode;
    }
}
