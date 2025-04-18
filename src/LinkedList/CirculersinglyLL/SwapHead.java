package LinkedList.CirculersinglyLL;

public class SwapHead {
    private static Node swapHead(Node head) {
        Node p1 = head;
        Node p2 = head;
        while (p2.next.next != head) {
            p2 = p2.next;
        }
        p2.next.next = p1.next;
        p1.next = p2.next;
        p2.next = p1;
        head = p1.next;
        return head;
    }
    public static void main(String[] args) {
        CirSinglyLL cll = new CirSinglyLL();
        cll.insert(10);
        cll.insert(20);
        cll.insert(30);
        cll.insert(40);
        Node head = swapHead(cll.getHead());
        cll.print(head);
    }
}
