package LinkedList.SinglyLL;

public class Remove_dup_SortedLL {
    public static void RmvDup(Node head) {
        Node p1 = head;
        Node p2 = head.next;
        while (p2 != null) {
            Node temp = p2;
            if (p1.data == p2.data) {
                p2 = p2.next;
                temp.next =null;
            } else {
                p1.next = p2;
                p1 = p2;
                p2 = p1.next;
            }
        }
        p1.next = null;
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insert(10);
        ll.insert(10);
        ll.insert(20);
        RmvDup(ll.getHeade());
        ll.print(ll.getHeade());
    }
}
