package BinaryTree.Traversal;

import BinaryTree.Node;

public class PostOrder {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        PostOrderTravesal(root);
    }

    public static void PostOrderTravesal(Node root) {
        if (root == null) {
            return;
        }
        PostOrderTravesal(root.left);
        PostOrderTravesal(root.right);
        System.out.print(root.data+" ");
    }
}
