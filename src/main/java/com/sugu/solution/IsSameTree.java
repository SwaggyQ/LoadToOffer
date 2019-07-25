package com.sugu.solution;

import com.sugu.solution.base.TreeNode;

/**
 * @author: create by sugu
 * @date:2019/7/24
 */
public class IsSameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        }
        else if(p != null && q != null){
            if(p.val == q.val){
                return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
            }
        }
        return false;

    }
}
