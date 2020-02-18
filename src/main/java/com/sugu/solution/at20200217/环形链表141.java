package com.sugu.solution.at20200217;

import com.sugu.solution.base.ListNode;

/**
 * @author: Gu Quanye
 * @Date: 2020/2/17 11:28 下午
 * @Number: 141
 * @Link: https://leetcode-cn.com/problems/linked-list-cycle/
 */
public class 环形链表141 {

    public boolean hasCycle(ListNode head) {
        if (head == null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != slow){
            if (fast == null || fast.next == null){
                return false;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        return true;
    }
}
