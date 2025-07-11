package BinaryTree.Program;

import BinaryTree.Node;
import java.util.LinkedList;
import java.util.Queue;

class BinaryTree {
    static Node root;
    Queue<Node> q;
    public BinaryTree() {
        q = new LinkedList<>();
    }
    public void insert(int data) {
        Node nn = new Node(data);
        if (root == null) {
            root = nn;
            q.add(nn);
        } else {
            while (!q.isEmpty()) {
                Node front = q.peek();
                if (front.left == null) {
                    front.left = nn;
                    q.add(nn);
                    break;
                } else if (front.right == null) {
                    front.right = nn;
                    q.add(nn);
                    q.poll();
                    break;
                } else {
                    q.poll();
                }
            }
        }
    }


    public void printTree() {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node temp = q.poll();
            System.out.print(temp.data +" ");
            if (temp.left != null) {
                q.add(temp.left);
            }
            if (temp.right != null) {
                q.add(temp.right);
            }
        }
    }
}
public class CreateBinaryTree {
    public static void main(String[] args) {
        int[] arr = {55,546,345,443,4,65,6,34,5,24,4,234,3};
        BinaryTree bt = new BinaryTree();
        for (int i = 0; i < arr.length; i++) {
            bt.insert(arr[i]);
        }
        bt.printTree();
    }
}
