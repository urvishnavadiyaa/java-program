package BinaryTree.Program;

import BinaryTree.Node;

public class FindElement {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(FindEle(root, 5));
    }

    private static boolean FindEle(Node root, int ele) {
        if (root == null) {
            return false;
        }
        boolean l = FindEle(root.left, ele);
        boolean r = FindEle(root.right, ele);
        if (l || r || root.data == ele) {
            return true;
        } else {
            return false;
        }
    }
}
