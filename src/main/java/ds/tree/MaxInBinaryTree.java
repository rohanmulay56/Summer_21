package ds.tree;

import static ds.tree.InorderTraversal.getTree;

public class MaxInBinaryTree {
    public static void main(String[] args) {
        InorderTraversal.Node root = getTree();
        int max = getMaxElement(root);
        System.out.println(max);
    }

    private static int getMaxElement(InorderTraversal.Node root) {
        int leftMax = Integer.MIN_VALUE;
        int rightMax = Integer.MIN_VALUE;
        if (root.left == null && root.right == null) {
            return root.value;
        }
        if (root.left != null) {
            leftMax = getMaxElement(root.left);
        }
        if (root.right != null) {
            rightMax = getMaxElement(root.right);
        }

        int maxChild = Math.max(leftMax, rightMax);
        return Math.max(maxChild, root.value);
    }
}
