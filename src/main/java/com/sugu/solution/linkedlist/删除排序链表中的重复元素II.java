package com.sugu.solution.linkedlist;

import com.sugu.solution.base.ListNode;
import com.sugu.solution.base.ListNodeHelper;

/**
 * @author: Gu Quanye
 * @Date: 2020/2/19 2:59 上午
 * @Number: 82
 * @Link: https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list-ii/
 */
public class 删除排序链表中的重复元素II {

    public static void main(String[] args) {
        ListNode node = ListNodeHelper.createLinkedList("1,1,2");
        deleteDuplicates(node);
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null){
            return null;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        while (head != null){
            ListNode cache = head;
            ListNode next = head;
            while (head.next != null && head.next.val == cache.val){
                next = head.next.next;
                head = head.next;
            }
            pre.next = next;
            if (head != next){
                head = next;
                continue;
            }
            pre = head;
            head = head.next;
        }
        return dummy.next;
    }
}
