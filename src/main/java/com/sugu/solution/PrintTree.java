package com.sugu.solution;

import com.sugu.solution.base.TreeNode;

import java.util.ArrayList;

/**
 * 题目描述
 * 从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
 * 链接:
 https://www.nowcoder.com/practice/445c44d982d04483b04a54f298796288?tpId=13&tqId=11213&tPage=2&rp=2&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class PrintTree {
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        helper(pRoot,1,result);
        return result;
    }

    private void helper(TreeNode root, int i, ArrayList<ArrayList<Integer>> result) {
        if(root == null) return;
        if(i > result.size()){
            result.add(new ArrayList<Integer>());
        }
        result.get(i-1).add(root.val);
        helper(root.left,i+1,result);
        helper(root.right,i+1,result);

    }
}
