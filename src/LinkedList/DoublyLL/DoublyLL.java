package LinkedList.DoublyLL;

public class DoublyLL {
    Node head,tail;

    public void insert(int data) {
        Node nn = new Node(data);
        if (head == null) {
            head = tail = nn;
        } else {
            tail.next = nn;
            nn.prev = tail;
            tail = nn;
        }
    }

    public void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void printrev(Node tail) {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
    }

    public void delete(int data) {
        if (head == null) {
            System.out.println("there are no node to delete");
        } else if (head.data == data) {
            if (head == tail) {
                head = tail = null;
            } else {
                Node temp = head;
                head = head.next;
                head.prev = null;
                temp.next = null;
                delete(data);
            }
        } else {
            Node temp = head;
            while (temp.next != null && temp.next.data != data) {
                temp = temp.next;
            }
            if (temp.next == null) {
                System.out.println("data not found");
                return;
            }
            if (temp.next == tail) {
                temp.next = null;
                tail.prev = null;
                tail = temp;
            } else {
                Node t1 = temp.next;
                temp.next = temp.next.next;
                t1.next.prev = t1.prev;
                t1.next = null;
                t1.prev = null;
                delete(data);
            }
        }
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }
}
