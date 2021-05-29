package ds.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import static ds.tree.InorderTraversal.getTree;

public class ReverseLevelOrderTravesal {
    public static void main(String[] args) {
        InorderTraversal.Node tree = getTree();
        reverseLevelOrderTravesal(tree);
        System.out.println("\n");
        levelOrderTravesal(tree);
    }

    private static void reverseLevelOrderTravesal(InorderTraversal.Node root) {
        Stack<InorderTraversal.Node> nodeStack = new Stack<>();
        Queue<InorderTraversal.Node> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);
        while (nodeQueue.peek() != null) {
            InorderTraversal.Node node = nodeQueue.poll();
            if (node.right != null) {
                nodeQueue.add(node.right);
            }
            if (node.left != null) {
                nodeQueue.add(node.left);
            }
            nodeStack.add(node);
        }
        while (!nodeStack.isEmpty()) {
            System.out.print("," + nodeStack.pop().value);
        }
    }

    private static void levelOrderTravesal(InorderTraversal.Node root) {
        Queue<InorderTraversal.Node> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);
        while (nodeQueue.peek() != null) {
            InorderTraversal.Node node = nodeQueue.poll();
            System.out.print("," + node.value);
            if (node.left != null) {
                nodeQueue.add(node.left);
            }
            if (node.right != null) {
                nodeQueue.add(node.right);
            }
        }
    }
}
