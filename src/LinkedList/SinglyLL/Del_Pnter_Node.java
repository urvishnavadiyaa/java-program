package LinkedList.SinglyLL;

public class Del_Pnter_Node {
    public static Node sreachPointer(int p,Node head) {
        Node temp = head;
        while (temp.next != null && temp.next.data != p) {
            temp = temp.next;
        }
        return temp.next;
    }

    private static void deleteON(Node p) {
        Node temp = p;
        while (temp.next.next != null) {
            temp.data = temp.next.data;
            temp = temp.next;
        }
        temp.data = temp.next.data;
        temp.next = null;
    }

    private static void deleteO1(Node p) {
        Node temp = p.next;
        p.data = p.next.data;
        p.next = p.next.next;
        temp.next = null;
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
        Node p = sreachPointer(70,ll.getHeade());
        deleteON(p);
        ll.print(ll.getHeade());
        deleteO1(p);
        ll.print(ll.getHeade());
    }
}
