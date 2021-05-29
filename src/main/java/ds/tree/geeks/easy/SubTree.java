package ds.tree.geeks.easy;

import ds.tree.InorderTraversal;

public class SubTree {
    public boolean isSubtree(InorderTraversal.Node s, InorderTraversal.Node t) {
        if (s == null) return false;
        if (isSame(s, t)) return true;
        return isSubtree(s.left, t) || isSubtree(s.right, t);
    }

    private boolean isSame(InorderTraversal.Node s, InorderTraversal.Node t) {
        if (s == null && t == null) return true;
        if (s == null || t == null) return false;

        if (s.value != t.value) return false;

        return isSame(s.left, t.left) && isSame(s.right, t.right);
    }
}
