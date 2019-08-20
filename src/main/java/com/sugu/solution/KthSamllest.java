package com.sugu.solution;

/**
 * @author: create by sugu
 * @date:2019/8/20
 * @link:
 */

import com.sugu.solution.base.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
// [5,3,6,2,4,null,null,1]  3
// 预期 3

public class KthSamllest {
    int result = 0,cnt=0;
    public int kthSmallest(TreeNode root, int k) {
        if(root==null) return 0;
        kthSmallest(root.left,k);
        cnt++;
        if(cnt==k) result=root.val;
        kthSmallest(root.right,k);
        return result;
    }
}