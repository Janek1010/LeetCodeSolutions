package org.example;


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class Main {
    public static void main(String[] args) {


    }
    public static TreeNode invertTree(TreeNode root) {
        if (root == null){
            return null;
        }
        TreeNode smallRoot = new TreeNode(root.val);
        // dla kazdego poddrzewa trzeba cos

        smallRoot.right = invertTree(root.left);
        smallRoot.left =  invertTree(root.right);

        return smallRoot;
    }
}