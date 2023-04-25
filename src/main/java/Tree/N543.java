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
 * @version N543.java v1.0 2023/4/23 4:21 下午 xiaojianan Exp $
 */
public class N543 {

    int maxDiameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        //二叉树的直径应该是左右子树的最大深度深度之和，现在要求最大直径，需要遍历
        maxDepth(root);
        return maxDiameter;
    }

    //与子树相关，需要合理设置返回值和定义
    //该函数做了两件事：1.返回当前节点最大深度，2.求当前节点的直径并更新
    public int maxDepth(TreeNode root){
        if (root == null) {
            return 0;
        }
        //求左右子树的最大深度
        int leftMaxDepth = maxDepth(root.left);
        int rightMaxDepth = maxDepth(root.right);
        //更新最大直径，当前节点的直径应该左右子树的最大深度之和
        int currentDiameter = leftMaxDepth + rightMaxDepth;
        maxDiameter = Math.max(currentDiameter, maxDiameter);
        return 1 + Math.max(leftMaxDepth, rightMaxDepth);
    }
}
