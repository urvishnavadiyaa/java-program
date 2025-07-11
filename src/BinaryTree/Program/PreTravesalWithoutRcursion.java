package BinaryTree.Program;

import BinaryTree.Node;

import java.util.Stack;

public class PreTravesalWithoutRcursion {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        Pretravesal(root);
    }

    private static void Pretravesal(Node root) {
        Stack<Node> stk = new Stack<>();
        stk.push(root);
        while (!stk.isEmpty()) {
            Node n = stk.pop();
            System.out.print(n.data+" ");
            if (n.right != null) {
                stk.push(n.right);
            }
            if (n.left != null) {
                stk.push(n.left);
            }
        }
    }
}
