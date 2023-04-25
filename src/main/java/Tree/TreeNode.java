/**
 * meituan.com Inc.
 * Copyright (c) 2010-2023 All Rights Reserved.
 */
package Tree;

/**
 * <p>
 *
 * </p>
 *
 * @author xiaojianan
 * @version TreeNode.java v1.0 2023/4/23 4:34 下午 xiaojianan Exp $
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
