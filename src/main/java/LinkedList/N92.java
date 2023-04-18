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
 * @version N92.java v1.0 2023/4/17 8:52 下午 xiaojianan Exp $
 */
public class N92 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        //反转节点的左节点以及右节点
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode leftCursor = dummy;
        ListNode rightCursor = head.next;
        //反转的左右节点
        ListNode pL = head;
        ListNode pR = head;
        //左边界
        for (int i = 0; i < left - 1; i++) {
            leftCursor = pL;
            pL = pL.next;

        }
        //右边界
        for (int i = 0; i < right - 1; i++) {
           pR = pR.next;
           rightCursor = pR.next;
        }
        //断了节点变成全新的链表
        pR.next = null;
        //翻转整个链表 重新连接
        leftCursor.next = reverse(pL);
        pL.next = rightCursor;
        return dummy.next;
    }

    //反转整个链表
    public ListNode reverse(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}
