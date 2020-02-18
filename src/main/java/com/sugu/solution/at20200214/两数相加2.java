package com.sugu.solution.at20200214;

import com.sugu.solution.base.ListNode;

/**
 * @author: Gu Quanye
 * @Date: 2020/2/14 2:02 下午
 * @Number: 2
 * @Link: https://leetcode-cn.com/problems/add-two-numbers/
 */
public class 两数相加2 {
    public static void main(String[] args) {
        ListNode node = new ListNode(8);
        ListNode node1 = new ListNode(9);
        ListNode node3 = new ListNode(9);

        node.next = node1;
        node1.next = node3;

        ListNode node2 = new ListNode(2);
        addTwoNumbers(node,node2);
    }
    // 1,8   0
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int cache = 0;
        while ( l1 != null || l2 != null){
            int l1V = l1 == null ? 0 : l1.val;
            int l2V = l2 == null ? 0 : l2.val;
            int val = l1V + l2V + cache;
            int cacheV = val % 10;
            cache = val / 10;
            curr.next = new ListNode(cacheV);
            curr = curr.next;
            l1 = l1 == null? null : l1.next;
            l2 = l2 == null? null : l2.next;
        }
        if(cache != 0){
            curr.next = new ListNode(cache);
        }
        return dummy.next;
    }
}
