package ds.tree.geeks.easy;

import ds.tree.InorderTraversal;

public class DiameterOfBTree {
    public static void main(String[] args) {

    }

    int max;

    public int diameterOfBinaryTree(InorderTraversal.Node root) {
        maxDepth(root);
        return max == 0 ? 0 : max - 1;//Because we want edges
    }

    public int maxDepth(InorderTraversal.Node root) {
        if (root == null) {
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        max = Math.max(max, left + right + 1);
        return Math.max(left, right) + 1;
    }


}
