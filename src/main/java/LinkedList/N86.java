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
 * @version N86.java v1.0 2023/4/17 2:52 下午 xiaojianan Exp $
 */
public class N86 {

    public ListNode partition(ListNode head, int x) {
        //将一个链表分为小于x的链表1，大于等于x的链表2
        ListNode lessValueDummyHead = new ListNode();
        ListNode greatValueDummyHead = new ListNode();
        ListNode p1 = lessValueDummyHead;
        ListNode p2 = greatValueDummyHead;
        ListNode p = head;
        while (p != null) {
            if(p.val < x){
                //放入小链表
                p1.next = p;
                p1 = p1.next;

            }else{
                p2.next = p;
                p2 = p2.next;
            }
            ListNode temp = p.next;
            //断开原链表的next
            p.next = null;
            p = temp;
        }
        //合并两个链表
        p1.next = greatValueDummyHead.next;
        return lessValueDummyHead.next;
    }
}


