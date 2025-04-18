package LinkedList.DoublyLL;

public class Rem_Dup_Unsorted_DLL {
    public static void removeDup(Node head) {
        Node t1 = head;
        while (t1 .next != null) {
            Node t2 = t1;
            while (t2.next != null) {
                if (t2.next.data == t1.data) {
                    Node temp = t2.next;
                    t2.next = t2.next.next;
                    if (temp.next != null) {
                        temp.next.prev = t2;
                    }
                    temp.next = null;
                    temp.prev = null;
                } else {
                    t2 = t2.next;
                }
            }
            t1 = t1.next;
        }
    }
    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();
        dll.insert(10);
        dll.insert(8);
        dll.insert(10);
        dll.insert(2);
        dll.insert(4);
        dll.insert(9);
        dll.insert(7);
        dll.insert(2);
        dll.insert(10);
        dll.insert(4);
        removeDup(dll.getHead());
        dll.print(dll.getHead());
    }
}
