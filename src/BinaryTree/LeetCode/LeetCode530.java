package BinaryTree.LeetCode;

import BinaryTree.Node;

public class LeetCode530 {
    static int diff = Integer.MAX_VALUE;
    static Node node = null;
    static Node node1 = null;
    public static void main(String[] args) {
        Node root = new Node(0);
        root.right = new Node(2236);
        root.right.right = new Node(2776);
        root.right.left = new Node(1277);
        root.right.left.left = new Node(519);
        getmindiff(root);
        System.out.println(diff);
    }
    public static Node getmindiff(Node root) {
        if (root == null) {
            return null;
        }

        Node l = getmindiff(root.left);
        if (l != null) {
            if (node != null) {
                diff = Math.min(Math.abs(root.data - node.data), diff);
                node = null;
            }
            diff = Math.min(Math.abs(root.data - l.data), diff);
        } else if (node1 != null) {
            diff = Math.min(Math.abs(root.data - node1.data), diff);
        }
        node1 = root;
        Node r = getmindiff(root.right);
        if (r != null) {
            diff = Math.min(Math.abs(root.data - r.data), diff);
        } else {
            node = root;
        }
        return root;
    }
}
