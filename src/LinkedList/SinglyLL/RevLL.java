package LinkedList.SinglyLL;

public class RevLL {
    private static Node reverseLL(Node head) {
        if (head == null) {
            System.out.println("LL is empty");
            return null;
        }
        Node prev = null;
        Node curr = head;
        Node next = head.next;
        if (head.next == null) {
            System.out.println("LL is already sorted");
            return head;
        }
        while (next != null) {
            curr.next = prev;
            prev = curr;
            curr = next;
            next = curr.next;
        }
        curr.next = prev;
        head = curr;
        return head;
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insert(10);
        ll.insert(20);
        ll.insert(30);
        ll.insert(40);
        ll.insert(50);
        Node head = reverseLL(ll.getHeade());
        ll.print(head);
    }
}
