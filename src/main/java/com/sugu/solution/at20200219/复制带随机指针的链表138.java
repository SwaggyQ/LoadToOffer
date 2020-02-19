package com.sugu.solution.at20200219;

import com.sugu.solution.base.Node;

import java.util.HashMap;

/**
 * @author: Gu Quanye
 * @Date: 2020/2/19 3:21 下午
 * @Number: 138
 * @Link: https://leetcode-cn.com/problems/copy-list-with-random-pointer/
 */
public class 复制带随机指针的链表138 {

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
