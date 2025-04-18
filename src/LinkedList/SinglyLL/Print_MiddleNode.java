package LinkedList.SinglyLL;

public class Print_MiddleNode {
    public static void Print_Middle(Node head) {
        Node p1 = head;
        Node p2 = head;
        while (p2.next != null && p2.next.next != null) {
            p1 = p1.next;
            p2 = p2.next.next;
        }
        System.out.println(p1.data);
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
        Print_Middle(ll.getHeade());
    }
}
