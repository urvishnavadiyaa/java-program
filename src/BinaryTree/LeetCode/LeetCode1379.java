package BinaryTree.LeetCode;

import BinaryTree.Node;

public class LeetCode1379 {
    public static void main(String[] args) {
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.left.left = new Node(4);
        root1.left.right = new Node(5);
        root1.right.left = new Node(6);
        root1.right.right = new Node(7);

        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.right = new Node(3);
        root2.left.left = new Node(4);
        root2.left.right = new Node(5);
        root2.right.left = new Node(6);
        root2.right.right = new Node(7);

        System.out.println(getTargetCopy(root1, root2, root1.right).data);
    }

    public static final Node getTargetCopy(final Node root1, final Node root2, final Node target) {
        if (root1 == null || root2 == null) {
            return null;
        }
        if (root1 == target) {
            return root2;
        }

        Node left = getTargetCopy(root1.left, root2.left, target);
        if (left != null) {
            return left;
        }
        return getTargetCopy(root1.right, root2.right, target);
    }
}
