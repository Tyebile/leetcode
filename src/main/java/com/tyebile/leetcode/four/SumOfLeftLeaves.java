package com.tyebile.leetcode.four;

import javax.swing.tree.TreeNode;

/**
 * @author Tyebile
 * @date 2019/9/2
 * 左子树只和
 */
public class SumOfLeftLeaves {

     public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }

    public static void main(String[] args) {

    }

    public static int sumOfLeftLeaves(TreeNode root) {

        if(root == null) return 0;

        int sum = sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
        if (root.left != null && root.left.left == null && root.left.right == null) {
            sum += root.left.val;
        }
        return sum;
    }
}
