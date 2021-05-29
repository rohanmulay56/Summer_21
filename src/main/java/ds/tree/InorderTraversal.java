package ds.tree;

public class InorderTraversal {
    public static class Node {
        public int value;
        public Node left = null;
        public Node right = null;

        public Node(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        Node tree = getTree();
        inorder(tree);
    }

    private static void inorder(Node tree) {
        if (null != tree) {
            inorder(tree.left);
            System.out.print("," + tree.value);
            inorder(tree.right);
        }
    }

    public static Node getTree() {
        Node root = new Node(10);
        root.left = new Node(11);
        root.left.left = new Node(7);
        root.right = new Node(9);
        root.right.left = new Node(15);
        root.right.right = new Node(8);
        return root;
    }
}
