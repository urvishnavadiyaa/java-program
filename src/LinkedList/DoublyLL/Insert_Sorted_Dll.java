package LinkedList.DoublyLL;

public class Insert_Sorted_Dll {
    private static Node[] Insert(Node head,Node tail,int data) {
        Node nn = new Node(data);
        if (head == null) {
            head = tail = nn;
            return new Node[]{head,tail};
        }else if (data < head.data) {
            head.prev = nn;
            nn.next = head;
            head = nn;
            return new Node[]{head,tail};
        } else if (data >= tail.data) {
            tail.next = nn;
            nn.prev = tail;
            tail = nn;
            return new Node[]{head,tail};
        } else {
            Node t1 = head;
            Node t2 = head.next;
            while (t2.data <= data) {
                t1 = t1.next;
                t2 = t2.next;
            }
            t1.next = nn;
            nn.next = t2;
            nn.prev = t1;
            t2.prev = nn;
            return new Node[]{head,tail};
        }
    }
    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();
        dll.insert(10);
        dll.insert(20);
        dll.insert(30);
        dll.insert(40);
        dll.insert(50);
        Node arr[] = Insert(dll.getHead(),dll.getTail(),33);
        dll.print(arr[0]);
        System.out.println();
        dll.printrev(arr[1]);
    }
}
