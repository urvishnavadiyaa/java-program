package LinkedList.SinglyLL;

public class Detact_Loop {
    public static void MakeCycle(int data,Node head,Node tail) {
        Node temp = head;
        while (temp.data != data) {
            temp = temp.next;
        }
        tail.next = temp;
    }

    public static void DetactCycle(Node head) {
        Node t1 = head.next;
        Node t2 = head.next.next;
        while (t1.data != t2.data) {
            t1 = t1.next;
            t2 = t2.next.next;
        }
        t1 = head;
        while (t1.data != t2.data) {
            t1 = t1.next;
            t2 = t2.next;
        }
        System.out.println(t1.data);
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insert(10);
        ll.insert(20);
        ll.insert(30);
        ll.insert(40);
        ll.insert(50);
        ll.insert(60);
        ll.insert(70);
        ll.insert(80);
        ll.insert(90);
        ll.insert(100);
        MakeCycle(40,ll.getHeade(),ll.gettail());
        DetactCycle(ll.getHeade());
    }
}
