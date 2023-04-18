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
 * @version N19.java v1.0 2023/4/17 7:41 下午 xiaojianan Exp $
 */
public class N19 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        //定义两个指针p1 p2, p1先走n 步，那p1遍历到结尾的时候，p2就是要删除的节点的前一个节点了
        ListNode p1  = dummy;
        ListNode p2  = dummy;
        for (int i = 0; i < n ; i++) {
            p1 = p1.next;
        }
        while (p1.next != null){
            p1 = p1.next;
            p2 = p2.next;
        }
        //删除p2的下一个节点
        p2.next = p2.next.next;
        return dummy.next;
    }
}
