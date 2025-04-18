package LinkedList.DoublyLL;

public class Find_Pair_Dll {
    private static void FindPair(Node head,Node tail,int sum) {
        Node t1 = head;
        Node t2 = tail;
        int count = 0 ;
        while (t1 != t2) {
            int total = t1.data + t2.data;
            if (total == sum) {
                System.out.println(t1.data +" "+ t2.data);
                t1 = t1.next;
                t2 = t2.prev;
                count++;
            } else if (total > sum){
                t2 = t2.prev;
            } else {
                t1 = t1.next;
            }
        }
        if (count == 0) {
            System.out.println("pair not found");
        }
    }
    public static void main(String[] args) {
        DoublyLL  dll = new DoublyLL();
        dll.insert(1);
        dll.insert(2);
        dll.insert(3);
        dll.insert(4);
        dll.insert(5);
        dll.insert(6);
        dll.insert(7);
        int sum = 89;
        FindPair(dll.getHead(),dll.getTail(),sum);
    }
}
