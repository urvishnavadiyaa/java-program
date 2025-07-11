package BinaryTree.LeetCode;
import BinaryTree.Node;

import java.util.*;

public class LeetCode637 {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        List<Double> l =  averageOfLevels(root);
        System.out.println(l);
    }

    public static List<Double> averageOfLevels(Node root) {
        List<Double> list = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            double sum = 0.0;
            int size = q.size();
            for (int i = 0; i < size; i++) {
                Node n = q.remove();
                if (n.left != null) {
                    q.add(n.left);
                }
                if (n.right != null) {
                    q.add(n.right);
                }
                sum += n.data;
            }
            list.add(sum/size);
        }
        return list;
    }
}
