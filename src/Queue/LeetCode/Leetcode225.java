package Queue.LeetCode;

import java.util.LinkedList;
import java.util.Queue;

public class Leetcode225 {
    static Queue<Integer> q1 = new LinkedList<>();
    static Queue<Integer> q2 = new LinkedList<>();

    public static void insertHeavy(int val) {
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
        insertHeavy(10);
        insertHeavy(20);
        insertHeavy(30);
        insertHeavy(40);
        insertHeavy(50);
        deleteHeavy();
        System.out.println(q1);
    }
}
