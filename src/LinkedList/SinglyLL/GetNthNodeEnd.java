package LinkedList.SinglyLL;

public class GetNthNodeEnd {
    public static void Get_Nth_Node(int n,Node head) {
        Node t1 = head;
        Node t2 = head;
        int count = 0;
        while (t2.next != null) {
            if (count == n-1) {
                t1 = t1.next;
            } else {
                count++;
            }
            t2 = t2.next;
        }
        System.out.println(t1.data);
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
        Get_Nth_Node(6,ll.getHeade());
    }

}
