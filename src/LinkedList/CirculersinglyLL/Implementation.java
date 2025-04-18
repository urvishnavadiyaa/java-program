package LinkedList.CirculersinglyLL;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data=data;
    }
}
class CirSinglyLL {
    Node head;
    public void insert(int data) {
        Node nn = new Node(data);
        if (head == null) {
            head = nn;
            nn.next = nn;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = nn;
            nn.next = head;
        }
    }

    public void print(Node head) {
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
    }

    public void checkIsCirculer() {
        Node temp = head;
        if (head == null) {
            System.out.println("there is no LL");
        } else if (head.next == null) {
            System.out.println("LL is not");
        } else if (head.next == head) {
            System.out.println("LL is cir");
        } else {
            Node p1 = head.next;
            while (p1 != head) {
                p1 = p1.next;
                if (p1 == null) {
                    System.out.println("LL is not cir");
                    return;
                }
            }
            System.out.println("LL is cir");
        }
    }

    public Node getHead() {
        return head;
    }
}

public class Implementation {
    public static void main(String[] args) {
        CirSinglyLL cll = new CirSinglyLL();
        cll.insert(10);
        cll.insert(20);
        cll.insert(30);
        cll.insert(40);
        cll.insert(50);
        cll.insert(39);
        cll.print(cll.getHead());
        cll.checkIsCirculer();
    }
}
