package BinaryTree.Program;
import BinaryTree.Node;

import java.util.Deque;
import java.util.LinkedList;

public class inorderTravesalWithoutRecursion {
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
        inorderTravesal(root);
    }

    private static void inorderTravesal(Node root) {
        boolean flag = true;
        Deque<Node> dq = new LinkedList<>();
        dq.add(root);

        while (!dq.isEmpty()) {
            Node n = dq.peekFirst();
            if (flag) {
                if (n.left == null) {
                    flag = false;
                } else {
                    dq.addFirst(n.left);
                }
            } else {
                Node n1 = dq.pollFirst();
                System.out.print(n1.data+" ");
                if (!dq.isEmpty()) {
                    Node n2 = dq.pollFirst();
                    System.out.print(n2.data+" ");
                    if (n2.right != null) {
                        dq.addFirst(n2.right);
                        flag = true;
                    }
                }
            }
        }
    }
}
