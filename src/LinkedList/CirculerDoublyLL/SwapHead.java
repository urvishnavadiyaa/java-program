package LinkedList.CirculerDoublyLL;

class Node {
    int data;
    Node next;
    Node prev;

    public Node(int data) {
        this.data=data;
    }
}
class CirculerDll {
    Node head,tail;
    public void insert(int data) {
        Node nn = new Node(data);
        if (head == null) {
            head = tail = nn;
            nn.next = nn;
            nn.prev = nn;
        } else {
            tail.next = nn;
            nn.prev = tail;
            nn.next = head;
            head.prev = nn;
            tail = nn;
        }
    }
    public void print(Node head) {
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        while (temp != head);
    }

    public void printrev(Node tail) {
        Node temp = tail;
        int count = 0;
        while (count != 10) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
            count++;
        }
    }
    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }
}
public class SwapHead {
    private static Node swapHead1(Node head) {
        Node t1 = head;
        Node t2 = head;
        while (t2.next.next != head) {
            t2 = t2.next;
        }
        t2.next.next = t1.next;
        t2.next.prev = t1;
        t1.next.prev = t2.next;
        t1.prev = t2;
        t1.next = t2.next;
        t2.next = t1;
        head = head.next;
        return head;
    }
    public static void main(String[] args) {
        CirculerDll cdll = new CirculerDll();
        cdll.insert(10);
        cdll.insert(20);
        cdll.insert(30);
        cdll.insert(40);
        Node head = swapHead1(cdll.getHead());
        cdll.print(head);
        System.out.println();
    }

}
