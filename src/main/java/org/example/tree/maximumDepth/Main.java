package org.example.tree.maximumDepth;

import org.example.tree.TreeNode;

public class Main {
    static int count = 0;
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        TreeNode leftSubTree = root.left;
        leftSubTree.left = null;
        leftSubTree.right = null;

        TreeNode rightSubtree = root.right;
        rightSubtree.left = new TreeNode(15);
        rightSubtree.right = new TreeNode(7);

        System.out.println(maxDepth(root));

    }
    public static int maxDepth(TreeNode root) {
        //Input: root = [3,9,20,null,null,15,7]
        count ++;
        System.out.println("count "+count+" with root "+ ((root == null) ? "null" : root.val));

        if (root == null) {
            return 0;
        } else {
            int lDepth = maxDepth(root.left);
            int rDepth = maxDepth(root.right);
            System.out.println(lDepth + " - count "+count);
            System.out.println(rDepth + " - count "+count);
            if (lDepth > rDepth)
                return (lDepth + 1);
            else
                return (rDepth + 1);
        }
    }
}
