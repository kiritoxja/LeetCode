/**
 * meituan.com Inc.
 * Copyright (c) 2010-2023 All Rights Reserved.
 */
package LinkedList;

import java.awt.*;

/**
 * <p>
 *
 * </p>
 *
 * @author xiaojianan
 * @version N25.java v1.0 2023/4/18 8:13 下午 xiaojianan Exp $
 */
public class N25 {

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next = null;
        new N25().reverseKGroup(listNode1, 1);
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null){
            return head;
        }
        //不足k个时不反转
        ListNode b = head;
        int count = 1;
        while (b != null && count < k){
            count++;
            b = b.next;
        }
        if(b == null){
            return head;
        }
        //翻转a，b间的节点
        ListNode retainNode = b.next;
        ListNode newHead = reverse(head, b);
        //此时a变成了最后一个节点，它的next应该是子部分节点的头节点
        head.next = reverseKGroup(retainNode, k);
        return newHead;
    }


    //反转节点a,b之间的元素
    public ListNode reverse(ListNode a, ListNode b) {
        ListNode pre = null;
        ListNode cur = a;
        ListNode temp;
        ListNode end = b.next;
        while(cur != end){
            //当前节点next为pre
            temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return b;
    }

}
