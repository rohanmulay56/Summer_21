package ds.tree.geeks.easy;

import ds.tree.InorderTraversal;

import static ds.tree.InorderTraversal.getTree;

public class SymmetricTree {
    public static void main(String[] args) {
        InorderTraversal.Node tree1 = getTree();
        System.out.println(isSymmetric(tree1, tree1));
    }

    public static boolean isSymmetric(InorderTraversal.Node node1, InorderTraversal.Node node2) {
        if (node1 == null && node2 == null) {
            return true;
        }
        if ((node1 != null && node2 != null) && (node1.value == node2.value)) {
            return isSymmetric(node1.left, node2.right) && isSymmetric(node1.right, node2.left);
        }
        return false;
    }
}
