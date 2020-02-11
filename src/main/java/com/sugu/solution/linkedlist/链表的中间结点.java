package com.sugu.solution.linkedlist;

import com.sugu.solution.base.ListNode;

/**
 * @author: Gu Quanye
 * @Date: 2020/2/10 4:58 下午
 * @Number: 876
 * @Link: https://leetcode-cn.com/problems/middle-of-the-linked-list/
 */
public class 链表的中间结点 {

    /**当有两个中间结点时取第二个**/
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    /**当有两个中间结点时取第一个**/
    public ListNode middleNode2(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
