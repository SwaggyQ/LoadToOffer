package com.sugu.solution.linkedlist;

import com.sugu.solution.base.ListNode;

/**
 * @author: Gu Quanye
 * @Date: 2020/2/12 11:25 上午
 * @Number: 160
 * @Link: https://leetcode-cn.com/problems/intersection-of-two-linked-lists/
 */
public class 相交链表 {


    // bullshit solution
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null){
            return null;
        }
        ListNode tmpA = headA;
        ListNode tmpB = headB;
        int cntA = 0;
        int cntB = 0;
        while (tmpA != null){
            tmpA = tmpA.next;
            cntA++;
        }
        while (tmpB != null){
            tmpB = tmpB.next;
            cntB++;
        }
        if (cntA > cntB){
            int delt = cntA - cntB;
            while(delt-- > 0){
                headA = headA.next;
            }
            while (headA != null && cntB -- >0){
                if(headA == headB){
                    return headA;
                }else {
                    headA = headA.next;
                    headB = headB.next;
                }
            }
        }else if (cntA < cntB){
            int delt = cntB - cntA;
            while(delt-- > 0){
                headB = headB.next;
            }
            while (headA != null && cntA -- >0){
                if(headA == headB){
                    return headA;
                }else {
                    headA = headA.next;
                    headB = headB.next;
                }
            }

        }else if(cntA == cntB){
            while (headA != null && cntA -- >0){
                if(headA == headB){
                    return headA;
                }else {
                    headA = headA.next;
                    headB = headB.next;
                }
            }
        }
        return null;
    }

    // best solution
    public ListNode getIntersectionNode1(ListNode headA, ListNode headB){
        if(headA == null || headB == null){
            return null;
        }
        ListNode pA = headA;
        ListNode pB = headB;
        // 最后终止条件为pA和pB都为null
        while ( pA != pB){
            pA = pA == null? headB : pA.next;
            pB = pB == null? headA : pB.next;
        }
        return pA;
    }
}
