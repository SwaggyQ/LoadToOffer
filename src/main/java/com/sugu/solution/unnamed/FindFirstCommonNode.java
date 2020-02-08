package com.sugu.solution.unnamed;


import com.sugu.solution.base.ListNode;

/**
 * 题目描述
 * 输入两个链表，找出它们的第一个公共结点。
 * 链接:
 https://www.nowcoder.com/practice/6ab1d9a29e88450685099d45c9e31e46?tpId=13&tqId=11189&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class FindFirstCommonNode {

    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        int p1Len = findListLen(pHead1);
        int p2Len = findListLen(pHead2);
        if(p1Len > p2Len){
            int del = p1Len - p2Len;
            for(int i=0;i<del;i++){
                pHead1 = pHead1.next;
            }
        }else {
            int del = p2Len - p1Len;
            for(int i=0;i<del;i++){
                pHead2 = pHead2.next;
            }
        }
        while(pHead1 != null){
            if(pHead1 == pHead2) return pHead1;
            pHead1 = pHead1.next;
            pHead2 = pHead2.next;
        }
        return null;
    }

    private int findListLen(ListNode head) {
        if(head == null) return 0;
        int len = 1;
        while(head.next != null){
            len++;
            head = head.next;
        }
        return len;
    }
}
