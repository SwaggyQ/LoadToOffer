package com.sugu.solution.unnamed;

import com.sugu.solution.base.ListNode;

/**
 * @author: create by sugu
 * @date:2019/7/25
 * @link:https://www.nowcoder.com/practice/75e878df47f24fdc9dc3e400ec6058ca?tpId=13&tqId=11168&tPage=1&rp=1&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking
 * {1,2,3,4,5}
 */
public class ReverseListNew {
    public ListNode ReverseList(ListNode head) {
        ListNode preHead = null;
        while (head != null){
            ListNode tmp = head.next;
            head.next = preHead;
            preHead = head;
            head = tmp;
        }
        return preHead;
    }
}
