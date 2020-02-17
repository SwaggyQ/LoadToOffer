package com.sugu.solution.linkedlist.at20200217;

import com.sugu.solution.base.ListNode;

import java.util.HashSet;

/**
 * @author: Gu Quanye
 * @Date: 2020/2/17 3:03 下午
 * @Number: 面试题  02.01
 * @Link: https://leetcode-cn.com/problems/remove-duplicate-node-lcci/
 */
public class 移除重复元素 {

    // with extra cache
    public ListNode removeDuplicateNodes(ListNode head) {
        HashSet<Integer> duplicateV = new HashSet<>();
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        while(head != null){
            if(duplicateV.contains(head.val)){
                pre.next = head.next;
                head = head.next;
            }else {
                duplicateV.add(head.val);
                pre = pre.next;
                head = head.next;
            }
        }
        return dummy.next;
    }

    // without extra cache
    public ListNode removeDuplicateNodes1(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        while(head != null){
            ListNode tmp = dummy.next;
            Boolean isContain = false;
            while (tmp != null && tmp != head){
                if(tmp.val == head.val){
                    isContain = true;
                    break;
                }
                tmp = tmp.next;
            }
            if(isContain){
                pre.next = head.next;
                head = head.next;
            }else {
                pre = pre.next;
                head = head.next;
            }
        }
        return dummy.next;
    }
}
