package LinkedList.LeetCode;

import javax.swing.plaf.IconUIResource;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data=data;
    }
}

class LinkedList {
    private Node head, tail;

    public void insert(int data) {
        Node nn = new Node(data);
        if (head == null) {
            head = tail = nn;
        } else {
            tail.next = nn;
            tail = nn;
        }
    }

    public void print(Node head) {
        Node idx = head;
        while (idx != null) {
            System.out.print(idx.data + " ");
            idx = idx.next;
        }
    }
    public Node getHeade() {
        return head;
    }
}
public class LeetCode3507 {
    public static int minimumPairRemoval(Node head) {
        int count = 0;
        Node curr = head;
        while (curr.next != null) {
            int min = Integer.MAX_VALUE;
            Node prev = null;
            Node curr1 = head;
            Node p1 = null;

            while (curr1.next != null) {
                int sum = curr1.data + curr1.next.data;
                if (sum < min) {
                    min = sum;
                    p1 = prev;
                }
                prev = curr1;
                curr1 = curr1.next;
            }

            if (p1.next.next.next == null) {
                head.data = head.data + head.next.data;
                head.next = head.next.next;
            } else {
                Node first = p1.next;
                Node second = first.next;

                first.data = first.data + second.data;
                first.next = second.next;
            }

            count++;
            curr = curr.next;
            if (head.next == null) break;
        }

        return count;
    }


    public static void main(String[] args) {
        int arr[] = {2,4,5,-11,8,7,-2,-4,-2,1,9};
        LinkedList ll = new LinkedList();
        for (int i = 0; i < arr.length; i++) {
            ll.insert(arr[i]);
        }
        int c = minimumPairRemoval(ll.getHeade());
        System.out.println(c);
    }
}
