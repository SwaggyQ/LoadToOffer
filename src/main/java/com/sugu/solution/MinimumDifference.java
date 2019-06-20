package com.sugu.solution;

import com.sugu.solution.base.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * 题目描述
 * 给定一个所有节点为非负值的二叉搜索树，求树中任意两节点的差的绝对值的最小值。
 * 链接:
 https://leetcode-cn.com/problems/minimum-absolute-difference-in-bst/solution/
 */
public class MinimumDifference {
    private ArrayList<Integer> order = new ArrayList<>();
    public int getMinimumDifference(TreeNode root) {
        int res = Integer.MAX_VALUE;
        helper(root);
        for(int i = 0; i < order.size() -1 ; i++){
            int delt = Math.abs(order.get(i+1) - order.get(i));
            res = Math.min(res,delt);
        }
        return res;

    }

    private void helper(TreeNode root) {
        if(root == null){
            return;
        }
        helper(root.left);
        order.add(root.val);
        helper(root.right);
    }
}
