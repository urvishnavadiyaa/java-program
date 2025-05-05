package Hashing;

import java.util.Objects;

class Node<K, V> {
    int hashcode;
    K key;
    V value;
    Node<K, V> next;

    public Node(int hashcode, K key, V value) {
        this.hashcode = hashcode;
        this.key = key;
        this.value = value;
    }
}

class Hashmap<K, V> {
    Node<K, V>[] arr;
    int count = 0;

    @SuppressWarnings("unchecked")
    public Hashmap() {
        arr = (Node<K, V>[]) new Node[16];
    }

    public void put(K key, V value) {
        int code = getindex(key, arr.length);
        Node<K, V> head = arr[code];

        while (head != null) {
            if (Objects.equals(head.key, key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }

        Node<K, V> nn = new Node<>(code, key, value);
        nn.next = arr[code];
        arr[code] = nn;
        count++;

        if ((float) count / arr.length > 0.75) {
            rehashing();
        }
    }

    public V get(K key) {
        int code = getindex(key, arr.length);
        Node<K, V> head = arr[code];
        while (head != null) {
            if (Objects.equals(head.key, key)) {
                return head.value;
            }
            head = head.next;
        }
        System.out.println("not found");
        return null;
    }

    private void rehashing() {
        @SuppressWarnings("unchecked")
        Node<K, V>[] oldArr = arr;
        arr = (Node<K, V>[]) new Node[oldArr.length * 2];
        count = 0;

        for (Node<K, V> head : oldArr) {
            while (head != null) {
                put(head.key, head.value);
                head = head.next;
            }
        }
    }

    public void printHashmap() {
        for (int i = 0; i < arr.length; i++) {
            Node<K, V> temp = arr[i];
            while (temp != null) {
                System.out.println(temp.key + " -> " + temp.value);
                temp = temp.next;
            }
        }
    }

    private int getindex(K key, int len) {
        int code = Objects.hashCode(key);
        return Math.abs(code) % len;
    }
}

public class implementation {
    public static void main(String[] args) {
        Hashmap<Integer, Integer> hm = new Hashmap<>();
        hm.put(1, 1000);
        hm.put(33, 2000);
        hm.put(242, 3000);
        hm.put(1, 4000);  // Update key 1
        hm.put(4574, 5000);
        hm.put(45745, 6000);
        hm.put(4645, 7000);

        Integer val = hm.get(242);
        System.out.println("Value for key 242: " + val);

        System.out.println("Current hashmap:");
        hm.printHashmap();
    }
}
