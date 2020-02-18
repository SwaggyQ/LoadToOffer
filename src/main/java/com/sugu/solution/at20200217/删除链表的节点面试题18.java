package com.sugu.solution.at20200217;

import com.sugu.solution.base.ListNode;

/**
 * @author: Gu Quanye
 * @Date: 2020/2/17 11:25 下午
 * @Number: 面试题18.
 * @Link: https://leetcode-cn.com/problems/shan-chu-lian-biao-de-jie-dian-lcof/
 */
public class 删除链表的节点面试题18 {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        while (head != null){
            if (head.val == val){
                pre.next = head.next;
                break;
            }else {
                pre = pre.next;
                head = head.next;
            }
        }
        return dummy.next;
    }
}
