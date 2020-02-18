package com.sugu.solution.at20200209;

import com.sugu.solution.base.ListNode;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author: Gu Quanye
 * @Date: 2020/2/9 9:00 下午
 * @Number: 1019
 * @Link: https://leetcode-cn.com/problems/next-greater-node-in-linked-list/
 */
public class 链表中的下一个更大节点1019 {

    class TmpObject{
        Integer val;
        Integer cnt;

        public TmpObject(Integer val, Integer cnt) {
            this.val = val;
            this.cnt = cnt;
        }

        @Override
        public String toString() {
            return "TmpObject{" +
                    "val=" + val +
                    ", cnt=" + cnt +
                    '}';
        }
    }
    public int[] nextLargerNodes(ListNode head) {
        Stack<TmpObject> stack = new Stack<TmpObject>();
        int[] result = new int[1000];
        int index = 0;
        stack.push(new TmpObject(head.val,index++));
        while ((head = head.next) != null){
            Integer oldV = stack.peek().val;
            if(oldV > head.val){
                stack.push(new TmpObject(head.val,index++));
            }else {
                while (!stack.empty() && stack.peek().val<head.val){
                    TmpObject tmpObject = stack.pop();
                    result[tmpObject.cnt] = head.val;
                    System.out.println(result);
                }
                stack.push(new TmpObject(head.val,index++));
            }
        }
        while (!stack.empty()){
            TmpObject tmpObject = stack.pop();
            result[tmpObject.cnt] = 0;
        }
        int[] finalResult = new int[index];
        for(int i = 0;i<index;i++){
            finalResult[i] = result[i];
        }
        return finalResult;
    }





    /**单调栈**/
    public int[] nextLargerNodes2(ListNode head) {
        Stack<Integer> stack = new Stack<Integer>();
        int[] map = new int[10000];
        int[] res = new int[10000];
        int i = 0;
        for(i=0;head != null; i++){
            map[i] = head.val;
            while(!stack.empty() && map[stack.peek()] < map[i]){
                res[stack.pop()] = map[i];
            }
            stack.push(i);
            head = head.next;
        }
        return Arrays.copyOfRange(res, 0, i);
    }
}
