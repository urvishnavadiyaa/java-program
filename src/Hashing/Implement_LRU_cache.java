package Hashing;
import java.util.HashMap;

public class Implement_LRU_cache {
    public static void main(String[] args) {
        LRU lru = new LRU(3);
        lru.insert(5);
        lru.insert(10);
        lru.insert(15);
        lru.search(5);
        lru.insert(20);
        lru.print();
    }
}

class Node1 {
    int data;
    Node1 next, prev;

    public Node1(int data) {
        this.data = data;
    }
}

class LRU {
    int cap;
    int size;
    DoublyLL doublyLL = new DoublyLL();
    HashMap<Integer, Node1> hashMap = new HashMap<>();

    public LRU(int cap) {
        this.cap = cap;
    }

    public void insert(int data) {
        if (hashMap.containsKey(data)) {
            doublyLL.deleteByPointer(hashMap.get(data));
            size--;
        }

        if (size == cap) {
            int deleteData = doublyLL.removeFirst();
            hashMap.remove(deleteData);
            size--;
        }

        Node1 nn = doublyLL.insert(data);
        hashMap.put(data, nn);
        size++;
    }

    public void print() {
        doublyLL.print();
    }

    public void search(int data) {
        if (hashMap.containsKey(data)) {
            System.out.println("Data is present");
            doublyLL.deleteByPointer(hashMap.get(data));
            Node1 nn = doublyLL.insert(data);
            hashMap.put(data, nn);
        } else {
            System.out.println("Data not present");
        }
    }
}

class DoublyLL {
    Node1 head, tail;

    public Node1 insert(int data) {
        Node1 nn = new Node1(data);
        if (head == null) {
            head = tail = nn;
        } else {
            tail.next = nn;
            nn.prev = tail;
            tail = nn;
        }
        return nn;
    }

    public int removeFirst() {
        if (head == null) return -1;
        int data = head.data;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        return data;
    }

    public void print() {
        Node1 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void deleteByPointer(Node1 node) {
        if (node == head && node == tail) {
            head = tail = null;
        } else if (node == head) {
            head = head.next;
            head.prev = null;
        } else if (node == tail) {
            tail = tail.prev;
            tail.next = null;
        } else {
            Node1 prev = node.prev;
            Node1 next = node.next;
            prev.next = next;
            next.prev = prev;
        }
    }
}
