package com.sugu.solution;

/**
 * Created by sugu on 2019/3/24.
 */

/**
 * 题目描述
 * 输入一棵二叉树，求该树的深度。从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度。
 * 链接:
 https://www.nowcoder.com/practice/435fb86331474282a3499955f0a41e8b?tpId=13&tqId=11191&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class TreeDepth {
    public int TreeDepth(TreeNode root) {
        if(root == null) return 0;
        int maxDepth = 1;
        return Math.max(helper(root.left,maxDepth),helper(root.right,maxDepth));
    }
    public int helper(TreeNode root,int depth){
        if(root == null) return depth;
        return Math.max(helper(root.left,depth+1),helper(root.right,depth+1));
    }

    public int TreeDepth2(TreeNode root) {
        if(root == null) return 0;
        int leftV = TreeDepth2(root.left);
        int rightV = TreeDepth2(root.right);

        return Math.max(leftV+1,rightV+1);
    }
}
