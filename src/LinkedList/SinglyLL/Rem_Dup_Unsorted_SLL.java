package LinkedList.SinglyLL;

public class Rem_Dup_Unsorted_SLL {
    public static void removeDup(Node head) {
        Node t1 = head;
        while (t1.next != null) {
            Node t2 = t1;
            while (t2.next != null) {
                if (t2.next.data == t1.data) {
                    Node temp = t2.next;
                    t2.next = t2.next.next;
                    temp.next = null;
                } else {
                    t2 = t2.next;
                }
            }
            t1 = t1.next;
        }
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insert(10);
        ll.insert(8);
        ll.insert(10);
        ll.insert(2);
        ll.insert(4);
        ll.insert(9);
        ll.insert(7);
        ll.insert(2);
        ll.insert(10);
        ll.insert(4);
        removeDup(ll.getHeade());
        ll.print(ll.getHeade());
    }
}
