package BinaryTree.LeetCode;
import BinaryTree.Node;

public class LeetCode938 {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int low = 4, high = 6;
        int result = rangeSumBST(root, low, high);
        System.out.println("Range Sum: " + result);
    }

    public static int rangeSumBST(Node root, int low, int high) {
        if (root == null) {
            return 0;
        }

        int left = rangeSumBST(root.left, low, high);
        int right = rangeSumBST(root.right, low, high);

        if (root.data >= low && root.data <= high) {
            return root.data + left + right;
        } else {
            return left + right;
        }
    }
}
