package BinaryTree.Traversal;

import BinaryTree.Node;

public class InOrder {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        inOrderTravesal(root);
    }

    private static void inOrderTravesal(Node root) {
        if (root == null) {
            return;
        }
        inOrderTravesal(root.left);
        System.out.print(root.data+" ");
        inOrderTravesal(root.right);
    }
}
