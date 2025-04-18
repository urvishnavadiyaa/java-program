package LinkedList.DoublyLL;

public class Remove_SortedDll {
    private static Node[] removeDup(Node head, Node tail) {
        Node t1 = head;
        Node t2 = head.next;
        while (t2 != null) {
            if (t1.data == t2.data) {
                Node temp = t2.next;
                t2.next = null;
                t2.prev = null;
                t2 = temp;
            } else {
                t1.next = t2;
                t2.prev = t1;
                t1 = t2;
                t2 = t2.next;
            }
        }
        t1.next = null;
        tail = t1;
        return new Node[]{head,tail};
    }
    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();
        dll.insert(10);
        dll.insert(10);
        dll.insert(10);
        dll.insert(20);
        dll.insert(20);
        dll.insert(30);
        dll.insert(40);
        dll.insert(40);
        dll.insert(40);
        dll.insert(40);
        dll.insert(50);
        dll.insert(50);
        Node[] arr= removeDup(dll.getHead(),dll.getTail());
        dll.print(arr[0]);
        System.out.println();
        dll.printrev(arr[1]);
    }
}
