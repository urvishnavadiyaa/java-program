package BinaryTree.Program;

import BinaryTree.Node;

public class FindNthNodeInOrdre {
    static int count = 0;
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        inorder(root , 4);
    }

    private static void inorder(Node root, int idx) {
        if (root == null) {
            return;
        }
        inorder(root.left, idx);
        count++;
        if (idx == count) {
            System.out.println(root.data);
            return;
        }
        inorder(root.right, idx);
    }
}
