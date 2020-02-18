package com.sugu.solution.at20200209;

import com.sugu.solution.base.ListNode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: Gu Quanye
 * @Date: 2020/2/9 8:28 下午
 * @Number: 1171
 * @Link: https://leetcode-cn.com/problems/remove-zero-sum-consecutive-nodes-from-linked-list/
 */
public class 从链表中删去总和值为零的连续节点1171 {

    /**map计算前缀和**/
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode preHead = new ListNode(0);
        preHead.next = head;
        int sum = 0;
        Map<Integer, ListNode> sum2Node = new HashMap<Integer, ListNode>();
        for(ListNode node = preHead; node!= null ; node = node.next){
            sum += node.val;
            sum2Node.put(sum,node);
        }
        sum = 0;
        preHead = new ListNode(0);
        preHead.next = head;
        for(ListNode node = preHead; node!= null ; node = node.next){
            sum += node.val;
            node.next = sum2Node.get(sum).next;
        }
        return preHead.next;
    }
}
