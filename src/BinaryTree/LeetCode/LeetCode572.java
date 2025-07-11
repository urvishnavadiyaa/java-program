package BinaryTree.LeetCode;

import BinaryTree.Node;

public class LeetCode572 {
    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(4);
        root.left.left = new Node(1);
        root.left.right = new Node(2);
        root.right = new Node(5);
        root.left.right.left = new Node(0);

        Node subroot = new Node(4);
        subroot.left = new Node(1);
        subroot.right = new Node(2);

        System.out.println(isSubtree(root, subroot));
    }
    public static boolean isSubtree(Node root, Node subroot) {
        if (root == null) {
            return true;
        }
        if (root == subroot) {
            return checksubtree(root, subroot);
        }
        return isSubtree(root.left, subroot) && isSubtree(root.right, subroot);
    }

    public static boolean checksubtree(Node root, Node subRoot) {
        if (root != subRoot) {
            return false;
        } else if (root != null && subRoot != null) {
            boolean l = checksubtree(root.left, subRoot.left);
            boolean r = checksubtree(root.right, subRoot.right);

            if (l && r && root.data == subRoot.data) {
                return true;
            } else {
                return false;
            }
        } else {
            return true;
        }
    }
}
