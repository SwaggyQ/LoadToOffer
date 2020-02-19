package com.sugu.solution.linkedlist;

import com.sugu.solution.base.ListNode;

/**
 * @author: Gu Quanye
 * @Date: 2020/2/19 3:07 下午
 * @Number: https://leetcode-cn.com/problems/kth-node-from-end-of-list-lcci/
 * @Link: 面试题 02.02.
 */
public class 返回倒数第k个节点0202 {
    public int kthToLast(ListNode head, int k) {
        if (head == null){
            return 0;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (k > 0 && fast != null){
            fast = fast.next;
            k--;
        }
        while (fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow.val;
    }
}
