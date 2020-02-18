package com.sugu.solution.at20200210;

import com.sugu.solution.base.ListNode;

/**
 * @author: Gu Quanye
 * @Date: 2020/2/10 10:07 上午
 * @Number: 21
 * @Link: https://leetcode-cn.com/problems/merge-two-sorted-lists/
 */
public class 合并两个有序链表21 {

    /**非递归版本**/
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        while (l1!=null || l2!=null){
            if(l1 == null ){
                head.next = l2;
                break;
            }else if(l2 == null ){
                head.next = l1;
                break;
            }else {
                if(l1.val>l2.val){
                    head.next = l2;
                    l2 = l2.next;
                }else {
                    head.next = l1;
                    l1 = l1.next;
                }
                head = head.next;
            }
        }
        return head.next;
    }

    /**递归版本**/
    public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        if(l1.val > l2.val){
            l2.next = mergeTwoLists(l1,l2.next);
            return l2;
        }else {
            l1.next = mergeTwoLists(l1.next,l2);
            return l1;
        }
    }
}
