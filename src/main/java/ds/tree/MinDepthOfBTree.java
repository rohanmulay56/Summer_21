package ds.tree;

import static ds.tree.InorderTraversal.getTree;

public class MinDepthOfBTree {
    public static void main(String[] args) {
        InorderTraversal.Node tree = getTree();
        System.out.println(getMinDepthRecursive(tree));
    }
    //Todo: for non recursive option visit https://www.geeksforgeeks.org/find-minimum-depth-of-a-binary-tree/

    private static int getMinDepthRecursive(InorderTraversal.Node tree) {
        if (tree == null)
            return 0;
        System.out.println("visited: " + tree.value);
        if (tree.left == null && tree.right == null)
            return 1;
        if (tree.left == null)
            return getMinDepthRecursive(tree.right) + 1;
        if (tree.right == null)
            return getMinDepthRecursive(tree.left) + 1;

        return 1 + Math.min(getMinDepthRecursive(tree.left), getMinDepthRecursive(tree.right));
    }


}
