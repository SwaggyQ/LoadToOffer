package com.sugu.solution.base;

import org.apache.commons.lang.StringUtils;

/**
 * @author: Gu Quanye
 * @Date: 2020/2/19 3:07 下午
 * @Number:
 * @Link:
 */
public class ListNodeHelper {
    public static ListNode createLinkedList(String str){
        String[] arr = StringUtils.split(str,",");
        ListNode dummy = new ListNode(0);
        ListNode pre = dummy;
        for(String s:arr){
            ListNode node = new ListNode(Integer.valueOf(s));
            pre.next = node;
            pre = node;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode s = ListNodeHelper.createLinkedList("1,2,3,4,5");
        System.out.println(s);
    }
}
