/**
 * meituan.com Inc.
 * Copyright (c) 2010-2023 All Rights Reserved.
 */
package LinkedList;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * <p>
 *
 * </p>
 *
 * @author xiaojianan
 * @version N23.java v1.0 2023/4/17 4:10 下午 xiaojianan Exp $
 */

public class N23 {
    public static void main(String[] args) {
        System.out.println(new N23().mergeKLists(new ListNode[]{}));
    }

    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummyNode = new ListNode();
        ListNode p = dummyNode;
        ListNode pqHead;
        //初始化构造二叉堆
        PriorityQueue<ListNode> pq = new PriorityQueue<>(Comparator.comparingInt(k -> k.val));
        for (ListNode head : lists) {
            if(head != null ){
                pq.add(head);
            }
        }
        while(pq.size() > 0){
            //取二叉堆最小的节点构造到当前节点之后
            pqHead = pq.poll();
            p.next = pqHead;
            p = p.next;
            //添加下一个节点
            if(pqHead.next != null){
                pq.add(pqHead.next);
            }
        }
        return dummyNode.next;
    }
}
