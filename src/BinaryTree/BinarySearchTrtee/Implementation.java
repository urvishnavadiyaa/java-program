package BinaryTree.BinarySearchTrtee;

import BinaryTree.Node;
import Hashing.Program.Unique_Number;

public class Implementation {
    public static void main(String[] args) {
        int[] arr = {10, 17, 18, 15, 2, 3, 9, 14, 16, 7, 6, 8, 11};
        BinarySearchTree bst = new BinarySearchTree();
        for (int i = 0; i < arr.length; i++) {
            Node n = new Node(arr[i]);
            bst.root = bst.insert(bst.root, n);
        }
        System.out.println(bst.search(bst.root, 8));
        bst.root = bst.delete(bst.root, 10);
        bst.printBST(bst.root);
    }
}
class BinarySearchTree {
    Node root;
    public Node insert(Node root, Node node) {
        if (root == null) {
            return node;
        } else if (node.data < root.data) {
            root.left = insert(root.left, node);
        } else if (node.data > root.data) {
            root.right = insert(root.right, node);
        }
        return root;
    }

    public void printBST(Node root) {
        if (root == null) {
            return;
        }
        printBST(root.left);
        System.out.print(root.data+" ");
        printBST(root.right);
    }

    public boolean search(Node root, int data) {
        if (root == null) {
            return false;
        }
        if (root.data > data) {
            return search(root.left, data);
        } else if (root.data < data){
            return search(root.right, data);
        } else {
            return true;
        }
    }

    public Node delete(Node root, int data) {
        if (root == null) return root;

        if (data < root.data) {
            root.left = delete(root.left, data);
        } else if (data > root.data) {
            root.right = delete(root.right, data);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            root.data = heapefy(root.right);
            root.right = delete(root.right, root.data);
        }
        return root;
    }

    private int heapefy(Node root) {
        int val = root.data;
        while (root.left != null) {
            val = root.left.data;
            root = root.left;
        }
        return val;
    }
}

