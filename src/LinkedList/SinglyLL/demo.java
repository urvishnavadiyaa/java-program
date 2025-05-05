package LinkedList.SinglyLL;
import java.util.Stack;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data=data;
    }
}

public class demo {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insert(60);
        ll.insert(20);
        ll.insert(10);
        ll.insert(40);
        ll.insert(10);
        ll.insert(10);
        ll.insert(60);
        ll.delete(10);
        ll.Update(10,50);
        ll.print(ll.getHeade());
    }
}

