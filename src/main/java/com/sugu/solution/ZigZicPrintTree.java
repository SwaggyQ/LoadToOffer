package com.sugu.solution;

import com.sugu.solution.base.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author: create by sugu
 * @date:2019/7/25
 */
public class ZigZicPrintTree {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        Boolean odd = false;
        Queue<TreeNode> nodeQ = new LinkedList<>();
        if(pRoot != null){
            nodeQ.add(pRoot);
        }
        while(nodeQ.size() != 0){
            odd = !odd;
            ArrayList<Integer> lineRes = new ArrayList<Integer>();
            int curSize = nodeQ.size();
            for(int i = 0; i<curSize; i++){
                TreeNode curNode = nodeQ.poll();
                if(curNode.left!=null) nodeQ.add(curNode.left);
                if(curNode.right!=null) nodeQ.add(curNode.right);
                if(odd) lineRes.add(curNode.val);
                else lineRes.add(0,curNode.val);
            }
            res.add(lineRes);
        }
        return res;

    }
}
