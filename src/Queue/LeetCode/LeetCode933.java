package Queue.LeetCode;

import java.util.LinkedList;
import java.util.Queue;

public class LeetCode933 {
    static
    public int ping(int t,Queue<Integer> q1) {
        int sr=t-3000;
        // int er=t;
        q1.add(t);
        while(q1.peek() < sr) {
            q1.poll();
        }
        return q1.size();
    }
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        int ans = ping(1 ,q1);
        System.out.println(ans);
    }
}
