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
 * @version N206.java v1.0 2023/4/17 8:49 下午 xiaojianan Exp $
 */
public class N206 {

    public ListNode reverseList(ListNode head) {
        //节点为空 或者仅有一个节点时无需反转
        if (head == null || head.next == null) {
            return head;
        }
        // 否则反转后面n - 1个节点
        ListNode newHead = reverseList(head.next);
        // 此时head应该在自己next节点的下一个节点
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}
