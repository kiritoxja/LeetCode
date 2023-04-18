/**
 * meituan.com Inc.
 * Copyright (c) 2010-2023 All Rights Reserved.
 */
package LinkedList;

/**
 * <p>
 *
 * </p>
 *
 * @author xiaojianan
 * @version N160.java v1.0 2023/4/17 8:25 下午 xiaojianan Exp $
 */
public class N160 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //找出两个链表的长度差值，让两条链表从同一起点出发，得到相交节点
        ListNode pA = headA;
        ListNode pB = headB;
        int lenA = calculateLinkedListLength(pA);
        int lenB = calculateLinkedListLength(pB);
        pA = headA;
        pB = headB;
        //到达同一起点
        if(lenA > lenB){
            for (int i = 0; i < lenA - lenB; i++) {
                pA = pA.next;
            }
        }else {
            for (int i = 0; i < lenB - lenA; i++) {
                pB = pB.next;
            }
        }
        //同时出发，若相等则为相交起点，否则为null
        while (pA != null && pB != null){
            if(pA == pB){
                return pA;
            }
            pA = pA.next;
            pB = pB.next;
        }
        return null;
    }

    public int calculateLinkedListLength(ListNode head){
        int i = 1;
        while (head.next != null){
            i++;
            head = head.next;
        }
        return i;
    }

}
