package BinaryTree.Program;
import BinaryTree.Node;

import java.util.Stack;

public class PostTravesalWithoutRecursion {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        possttravesal(root);
    }

    private static void possttravesal(Node root) {
        Stack<Node> stk1 = new Stack<>();
        Stack<Node> stk2 = new Stack<>();

        stk1.push(root);
        while (!stk1.isEmpty()) {
            Node n = stk1.pop();
            stk2.push(n);
            if (n.left != null) {
                stk1.push(n.left);
            }
            if (n.right != null) {
                stk1.push(n.right);
            }
        }
        while (!stk2.isEmpty()) {
            System.out.print(stk2.pop().data+" ");
        }
    }
}
