package LinkedList.LeetCode;

import java.util.LinkedList;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) {
        this.val = val; this.next = next;
    }
}
class LinkedList1 {
    ListNode head, tail;
    public void insert(int data) {
        ListNode nn = new ListNode(data);
        if (head == null) {
            head = tail = nn;
        } else {
            tail.next = nn;
            tail = nn;
        }
    }
}
public class LeetCode21 {
//    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//
//    }
    public static void main(String[] args) {
        LinkedList1 ll1 = new LinkedList1();
        ll1.insert(1);
        ll1.insert(2);
        ll1.insert(4);
        LinkedList1 ll2 = new LinkedList1();
        ll2.insert(1);
        ll2.insert(3);
        ll2.insert(4);
//        ListNode Node =  mergeTwoLists(ll1.head, ll2.head);
    }
}
