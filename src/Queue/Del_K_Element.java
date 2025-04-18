package Queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Del_K_Element {
    public static void main(String[] args) {
        int k=3;
        Deque<Integer> dq = new LinkedList<>();
        dq.add(1);
        dq.add(2);
        dq.add(3);
        dq.add(4);
        dq.add(5);
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < k; i++) {
            q.add(dq.pollFirst());
        }
        for (int i = 0; i < k; i++) {
            dq.addFirst(q.poll());
        }
        System.out.println(dq);
    }
}
