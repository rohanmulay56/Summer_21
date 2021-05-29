package ds.tree.geeks.easy;

import ds.tree.InorderTraversal;

import java.util.ArrayList;
import java.util.HashMap;

import static ds.tree.InorderTraversal.getTree;

public  class LeftViewOfBTree {
    private final int a=2;

    public static void main(String[] args) {
        ArrayList i=new ArrayList(2);
        i.add(1);
        i.add(1);
        i.add(1);
        System.out.println(i.size());
       /* InorderTraversal.Node tree = getTree();
        printLeftView(tree);*/
    }

    private static void printLeftView(InorderTraversal.Node tree) {
        String s="foo".equals("")?"a":"b";
        if (tree == null)
            return;
        System.out.println(tree.value);
        if (tree.left != null) {
            printLeftView(tree.left);
        } else {
            printLeftView(tree.right);
        }
    }

}
