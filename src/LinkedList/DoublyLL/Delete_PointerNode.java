package LinkedList.DoublyLL;

public class Delete_PointerNode {
    private static void delPointer(Node pointer, DoublyLL dll) {
        pointer.data = pointer.next.data;
        Node temp = pointer.next;
        pointer.next = pointer.next.next;
        temp.next.prev = pointer;
        temp.next = null;
        temp.prev = null;
    }
    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();
        dll.insert(5);
        dll.insert(8);
        dll.insert(13);
        dll.insert(15);
        dll.insert(22);
        dll.insert(35);
        dll.insert(43);
        delPointer(dll.getHead().next.next.next,dll);
        dll.print(dll.getHead());
        System.out.println();
        dll.printrev(dll.getTail());
    }
}
