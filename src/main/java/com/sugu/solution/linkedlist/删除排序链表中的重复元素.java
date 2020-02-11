package com.sugu.solution.linkedlist;

import com.sugu.solution.base.ListNode;

/**
 * @author: Gu Quanye
 * @Date: 2020/2/10 5:12 下午
 * @Number: 83
 * @Link: https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list/
 */
public class 删除排序链表中的重复元素 {

    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode cacheNode = head;
        ListNode dummy = cacheNode;
        while (head != null){
            if(cacheNode.val == head.val){
                cacheNode.next = head.next;
                head = head.next;
            }else {
                cacheNode = head;
                head = head.next;
            }
        }
        return dummy;
    }
}
