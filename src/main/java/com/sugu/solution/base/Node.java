package com.sugu.solution.base;

/**
 * @author: Gu Quanye
 * @Date: 2020/2/19 3:22 下午
 * @Number:
 * @Link:
 */
public class Node {
    public int val;
    public Node next;
    public Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
