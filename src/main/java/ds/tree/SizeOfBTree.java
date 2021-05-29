package ds.tree;

import static ds.tree.InorderTraversal.getTree;

public class SizeOfBTree {
    public static void main(String[] args) {
        InorderTraversal.Node root = getTree();
        int size = getSize(root);
        System.out.println(size);
    }

    private static int getSize(InorderTraversal.Node root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) {
            return 1;
        }
        return 1 + getSize(root.left) + getSize(root.right);
    }
}
