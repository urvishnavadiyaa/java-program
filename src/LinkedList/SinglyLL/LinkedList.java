package LinkedList.SinglyLL;

import java.util.Stack;

public class LinkedList {
    private Node head,tail;
    public void insert(int data) {
        Node nn = new Node(data);
        if (head == null) {
            head = tail = nn;
        } else {
        tail.next = nn;
        tail = nn;
        }
    }
    public Node getHeade() {
        return head;
    }
    public void print(Node head) {
        Node idx = head;
        while (idx != null) {
            System.out.print(idx.data+" ");
            idx = idx.next;
        }
        System.out.println();
    }

    public void find(int data) {
        Node idx = head;
        while (idx != null) {
            if (idx.data == data) {
                System.out.println("present");
                return;
            }
            idx= idx.next;
        }
        System.out.println("not present");
    }

    public void printRev() {
        Node idx = head;
        Stack<Integer> stk = new Stack<>();
        while (idx != null) {
            stk.push(idx.data);
            idx = idx.next;
        }
        while (!stk.isEmpty()) {
            System.out.print(stk.pop()+" ");
        }
        System.out.println();
    }

    public void delete(int data) {
        if (head == null) {
            System.out.println("no node to delete");
        } else if (head.data == data) {
            if(head==tail) {
                head=tail=null;
            }else {
                Node t = head.next;
                head.next = null;
                head = t;
                delete(data);
            }
        } else {
            Node temp = head;
            while (temp.next != null) {
                if (temp.next.data == data) {
                    if (temp.next == tail) {
                        temp.next = null;
                        tail = temp;
                    } else {
                        Node x = temp.next;
                        temp.next = temp.next.next;
                        x.next = null;
                    }
                    continue;
                }
                temp = temp.next;
            }
        }
    }

    public void Update(int preval, int upval) {
        if (head == null) {
            System.out.println("LL is empty");
        } else if (head == tail && head.data == preval) {
            head.data = upval;
            Update(preval,upval);
        } else {
            Node n1 = head;
            while (n1 != null) {
                if (n1.data == preval) {
                    if (n1 == tail) {
                        tail.data = upval;
                    } else {
                        n1.data = upval;
                    }
                    continue;
                }
                n1 = n1.next;
            }
        }
    }

    public Node gettail() {
        return tail;
    }
}
