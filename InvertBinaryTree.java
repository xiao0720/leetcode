/**
 * Problem: 226. Invert Binary Tree
 *
 * Idea:
 *
 * Solutions:
 *  invertTree: using invertTreeNode method, recursively, do the inversion until no
 * children exists.
 *  invertTreeCombined: simplified invertTree method.
 *
 */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class InvertBinaryTree {
    public TreeNode invertTreeNode(TreeNode node) {
        if (node.left != null) {
            invertTreeNode(node.left);
        }

        if (node.right != null) {
            invertTreeNode(node.right);
        }

        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;
        return node;
    }

    public TreeNode invertTree(TreeNode root) {
        if (root != null) {
            invertTreeNode(root);
        }
        return root;
    }

    public TreeNode invertTreeCombined(TreeNode root) {
        if (root == null) {
            return root;
        }

        TreeNode left = invertTreeCombined(root.left);
        TreeNode right = invertTreeCombined(root.right);
        root.left = right;
        root.right = left;

        return root;
    }
/*
    public static void main(String[] args) {
        InvertBinaryTree ibt = new InvertBinaryTree();
        TreeNode tree = new TreeNode(4);
        tree.left = new TreeNode(2);
        tree.left.left = new TreeNode(1);
        tree.left.right = new TreeNode(3);
        tree.right = new TreeNode(7);
        tree.right.left = new TreeNode(6);
        tree.right.right = new TreeNode(9);
        System.out.println(ibt.invertTree(tree));
    }*/
}
