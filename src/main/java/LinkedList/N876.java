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
 * @version N876.java v1.0 2023/4/17 7:59 下午 xiaojianan Exp $
 */
public class N876 {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
