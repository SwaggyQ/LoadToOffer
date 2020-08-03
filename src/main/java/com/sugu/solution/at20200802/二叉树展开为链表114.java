package com.sugu.solution.at20200802;

import com.sugu.solution.base.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * @author: Gu Quanye
 * @Date: 2020/8/2 8:43 下午
 * @Number:
 * @Link:
 */
public class 二叉树展开为链表114 {
    public void flattenWithRecursice(TreeNode root) {
        if(root == null){
            return;
        }
        List<TreeNode> list = helper(root);
        TreeNode nodeX = root;
        for(int i =1;i<list.size();i++){
            nodeX.left = null;
            nodeX.right = list.get(i);
            nodeX = nodeX.right;
        }
    }

    public List<TreeNode> helper(TreeNode root){
        List<TreeNode> list = new LinkedList<>();
        if(root == null){
            return list;
        }
        list.add(root);
        list.addAll(helper(root.left));
        list.addAll(helper(root.right));
        return list;
    }

    public void flatten(TreeNode root) {
        if(root == null){
            return;
        }
        flatten(root.left);
        flatten(root.right);
        TreeNode right = root.right;
        root.right = root.left;
        root.left = null;
        while(root.right != null){
            root = root.right;
        }
        root.right = right;
    }

}
