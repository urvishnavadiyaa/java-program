package LinkedList.SinglyLL;

public class Count_len {
    public static int countSize(Node head) {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
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
        int count = countSize(ll.getHeade());
        System.out.println(count);
    }
}
