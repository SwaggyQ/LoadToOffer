package com.sugu.solution;

import com.sugu.solution.base.ListNode;

/**
 * @author: create by sugu
 * @date:2019/7/25
 * @link:https://www.nowcoder.com/practice/529d3ae5a407492994ad2a246518148a?tpId=13&tqId=11167&tPage=1&rp=1&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking
 */
public class FindKthToTail {
    public ListNode findKthToTail(ListNode head, int k) {
        if(head == null) return null;
        ListNode res = head;
        while(k > 0){
            if(head == null) return null;
            head = head.next;
            k--;
        }
        while(head != null){
            res = res.next;
            head = head.next;
        }
        return res;
    }
}
