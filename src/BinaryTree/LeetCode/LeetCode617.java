package BinaryTree.LeetCode;
import BinaryTree.Node;

public class LeetCode617 {
    public static void main(String[] args) {
        Node root1 = new Node(1);
        root1.left = new Node(3);
        root1.right = new Node(2);
        root1.left.left = new Node(5);

        Node root2 = new Node(2);
        root2.left = new Node(1);
        root2.right = new Node(3);
        root2.left.right = new Node(4);
        root2.right.right = new Node(7);

        LeetCode617 obj = new LeetCode617();
        Node merged = obj.mergeTrees(root1, root2);
    }

    public Node mergeTrees(Node root1, Node root2) {
        if (root1 == null) return root2;
        if (root2 == null) return root1;

        root1.data += root2.data;
        root1.left = mergeTrees(root1.left, root2.left);
        root1.right = mergeTrees(root1.right, root2.right);

        return root1;
    }
}
