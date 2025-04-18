package Queue.LeetCode;

import java.util.LinkedList;
import java.util.Queue;

public class LeetCode1823 {
    public static void main(String[] args) {
        int n=5;
        int k=2;
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            q.add(i);
        }
        int count=1;
        while (q.size() != 1) {
            if (count == k) {
                q.poll();
                count =1;
            } else {
                q.add(q.poll());
                count++;
            }
        }
        System.out.println(q.poll());
    }
}
