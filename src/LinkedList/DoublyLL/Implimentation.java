package LinkedList.DoublyLL;

public class Implimentation {
    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();
        dll.insert(10);
        dll.insert(20);
        dll.insert(30);
        dll.insert(40);
        dll.insert(50);
        dll.insert(50);
        dll.insert(50);
        dll.insert(50);
        dll.delete(50);
        dll.print(dll.getHead());
        System.out.println();
        dll.printrev(dll.getTail());
    }
}
