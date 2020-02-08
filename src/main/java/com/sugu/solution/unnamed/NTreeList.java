package com.sugu.solution.unnamed;

import java.util.LinkedList;
import java.util.List;

/**
 * 题目描述
 * 给定一个 N 叉树，返回其节点值的前序遍历。
 * 链接:
 https://leetcode-cn.com/problems/n-ary-tree-preorder-traversal/
 */
public class NTreeList {
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val,List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
    List<Integer> res = new LinkedList<>();
    public List<Integer> preorder(Node root) {
        if(root != null){
            res.add(root.val);
            for(Node n : root.children){
                preorder(n);
            }
        }
        return res;
    }
}
