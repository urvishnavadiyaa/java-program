package BinaryTree.LeetCode;
import BinaryTree.Node;

public class LeetCode462 {
    static int[] level = new int[3001];
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
        maximumWidth(root, 1);

        int max = 0;
        for (int i = 0; i < level.length; i++) {
            if (level[i] > max) {
                max = level[i];
            }
        }
        System.out.println(max);
    }

    private static void maximumWidth(Node root, int count) {
        if (root == null) {
            return;
        }
        maximumWidth(root.left, count + 1);
        maximumWidth(root.right, count + 1);
        level[count]++;
    }
}
