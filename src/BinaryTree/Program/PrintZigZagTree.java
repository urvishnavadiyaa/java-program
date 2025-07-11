package BinaryTree.Program;
import BinaryTree.Node;

import java.util.Deque;
import java.util.LinkedList;

public class PrintZigZagTree {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.left.left.left = new Node(8);
        root.left.left.right = new Node(9);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(11);
        root.right.left.left = new Node(12);
        root.right.left.right = new Node(13);
        root.right.right.left = new Node(14);
        root.right.right.right = new Node(15);
        ZigZag(root);
    }

    private static void ZigZag(Node root) {
        Deque<Node> dq = new LinkedList<>();
        System.out.print(root.data+" ");
        dq.add(root);
        boolean isrev = true;
        while (!dq.isEmpty()) {
            int size = dq.size();
            if (isrev) {
                while (size > 0) {
                    Node n = dq.pollFirst();
                    System.out.print(n.data+" ");
                    if (n.left != null) {
                        dq.addLast(n.left);
                    }
                    if (n.right != null) {
                        dq.addLast(n.right);
                    }
                    size--;
                }
                isrev = false;
            } else {
                while (size > 0) {
                    Node n1 = dq.pollLast();
                    System.out.print(n1.data+" ");
                    if (n1.right != null) {
                        dq.addFirst(n1.right);
                    }
                    if (n1.left != null) {
                        dq.addFirst(n1.left);
                    }
                    size--;;
                }
                isrev = true;
            }
        }
    }
}
