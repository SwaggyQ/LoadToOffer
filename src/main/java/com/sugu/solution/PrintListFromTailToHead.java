package com.sugu.solution;

import com.sugu.solution.base.ListNode;

import java.util.ArrayList;

/**
 * @author: create by sugu
 * @date:2019/7/25
 * @link:https://www.nowcoder.com/practice/d0267f7f55b3412ba93bd35cfa8e8035?tpId=13&tqId=11156&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class PrintListFromTailToHead {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(listNode == null) return result;
        helper(listNode,result);
        return result;
    }
    void helper(ListNode node, ArrayList<Integer> result){
        if(node.next != null){
            helper(node.next,result);
        }
        result.add(node.val);
    }
}
