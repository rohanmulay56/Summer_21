package ds.tree;

import static ds.tree.InorderTraversal.getTree;

public class CompareTwoTreeIdentical {
    public static void main(String[] args) {
        InorderTraversal.Node tree1 = getTree();
        InorderTraversal.Node tree2 = getTree();
        //tree2.right.right.left=new InorderTraversal.Node(2);
        System.out.println(compareTrees(tree1, tree2));
    }

    private static boolean compareTrees(InorderTraversal.Node tree1, InorderTraversal.Node tree2) {
        if (null == tree1 && null == tree2)
            return true;
        if (tree1 == null)
            return false;
        if (tree2 == null)
            return false;
        if (tree1.value == tree2.value)
            return compareTrees(tree1.left, tree2.left) && compareTrees(tree1.right, tree2.right);
        return false;
    }
}
