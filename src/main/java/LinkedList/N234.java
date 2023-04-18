/**
 * meituan.com Inc.
 * Copyright (c) 2010-2023 All Rights Reserved.
 */
package LinkedList;

import java.util.LinkedList;

/**
 * <p>
 *
 * </p>
 *
 * @author xiaojianan
 * @version N234.java v1.0 2023/4/18 9:05 下午 xiaojianan Exp $
 */
public class N234 {
    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return true;
        }
        //链表压栈，然后比较头尾值即可
        LinkedList<ListNode> stack = new LinkedList<>();
        ListNode p = head;
        while (p != null) {
            stack.push(p);
            p = p.next;
        }
        ListNode q;
        p = head;
        while(true){
            //头尾开始遍历
            q = stack.poll();
            if(p.val != q.val){
                return false;
            }
            if(stack.isEmpty() || p == q || q.next == p){
                break;
            }
            p = p.next;
        }
        return true;
    }
}
