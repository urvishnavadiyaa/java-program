package LinkedList.DoublyLL;

public class Rev_Dll {
    private static Node[] revDll(Node head, Node tail) {
        Node t1 = tail;
        Node t2 = tail.prev;
        head = t1;
        while (t1.prev != null) {
            t1.prev = t1.next;
            t1.next = t2;
            t1 = t2;
            t2 = t1.prev;
        }
        t1.prev = t1.next;
        t1.next = t2;
        tail = t1;
        return new Node[]{head,tail};
    }
    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();
        dll.insert(10);
        dll.insert(20);
        dll.insert(30);
        dll.insert(40);
        dll.insert(50);
        Node arr[] = revDll(dll.getHead(),dll.getTail());
        dll.print(arr[0]);
        System.out.println();
        dll.printrev(arr[1]);
    }
}
