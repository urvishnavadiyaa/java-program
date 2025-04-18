package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class stack_Using_Two_Queue {
    static Queue<Integer> q1 = new LinkedList<>();
    static Queue<Integer> q2 = new LinkedList<>();

    public static void insertLose(int val) {
        q1.add(val);
    }

    public static void deleteHeavy() {
        while (q1.size() != 1) {
            q2.add(q1.poll());
        }
        q1.poll();
        while (!q2.isEmpty()) {
            q1.add(q2.poll());
        }
    }

    public static void main(String[] args) {
        insertLose(10);
        insertLose(20);
        insertLose(30);
        insertLose(40);
        insertLose(50);
        deleteHeavy();
        System.out.println(q1);
    }
}
