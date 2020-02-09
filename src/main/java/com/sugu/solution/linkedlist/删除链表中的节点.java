package com.sugu.solution.linkedlist;

import com.sugu.solution.base.ListNode;

/**
 * @author: Gu Quanye
 * @Date: 2020/2/8 10:19 下午
 * @Number: 237
 * @Link: https://leetcode-cn.com/problems/delete-node-in-a-linked-list/
 */
public class 删除链表中的节点 {

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
