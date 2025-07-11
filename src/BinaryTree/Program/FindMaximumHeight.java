package BinaryTree.Program;

import BinaryTree.Node;

public class FindMaximumHeight {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.left.left.left = new Node(8);
        System.out.println(FndMaxHeight(root));
    }

    private static int FndMaxHeight(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(FndMaxHeight(root.left) , FndMaxHeight(root.right));
    }
}
