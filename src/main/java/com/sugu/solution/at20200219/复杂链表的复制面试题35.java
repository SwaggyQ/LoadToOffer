package com.sugu.solution.at20200219;

import com.sugu.solution.base.Node;

import java.util.HashMap;

/**
 * @author: Gu Quanye
 * @Date: 2020/2/19 3:24 下午
 * @Number: https://leetcode-cn.com/problems/fu-za-lian-biao-de-fu-zhi-lcof/
 * @Link: 面试题35.
 */
public class 复杂链表的复制面试题35 {

    private HashMap<Node, Node> nodes = new HashMap<>();
    public Node copyRandomList(Node head) {
        if (head == null){
            return null;
        }
        if (nodes.containsKey(head)){
            return nodes.get(head);
        }
        Node newHead = new Node(head.val);
        nodes.put(head,newHead);
        newHead.next = copyRandomList(head.next);
        newHead.random = copyRandomList(head.random);
        return newHead;
    }
}
