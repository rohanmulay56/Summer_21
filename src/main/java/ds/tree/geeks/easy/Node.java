package ds.tree.geeks.easy;

public class Node {
    public Node(int val) {
        this.val = val;
    }

    public int val;
    public Node left, right;

    public Node find(int value) {
        if (null == this) {
            return null;
        }
        if (value == this.val) {
            return this;
        }

        if (this.left != null) {
            Node leftN = this.left.find(value);
            if (null != leftN) {
                return leftN;
            }
        }

        if (this.right != null) {
            Node rightN = this.right.find(value);
            if (null != rightN) {
                return rightN;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        Node root = new Node(0);
        root.left=new Node(1);
        root.right=new Node(2);

        Node node = root.find(1);
        if(node!=null)
        System.out.println(node.val);
        else
            System.out.println("Not found");
    }
}


