package Queue.LeetCode;

import java.util.LinkedList;
import java.util.Queue;

public class Leetcode649 {
    public static void main(String[] args) {
        String s = "RRDDDDRDRRRRDDD";
        Queue<Character> q = new LinkedList<>();
        int countd=0;
        int countR=0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'R') {
                countR++;
            } else {
                countd++;
            }
            q.add(s.charAt(i));
        }
//        System.out.println(q);
        int d1=0;
        int r1=0;
        while (!q.isEmpty()) {
            char ch = q.peek();
            if (countd == 0) {
                System.out.println("Rediant");
                break;
            }
            if (countR == 0) {
                System.out.println("Dier");
                break;
            }
            if (d1 == 0 && r1 == 0) {
                if (ch == 'R') {
                    q.add(q.poll());
                    r1++;
                } else {
                    q.add(q.poll());
                    d1++;
                }
            } else if (r1 == 0) {
                if (ch == 'R') {
                    countR--;
                    q.poll();
                    d1--;
                } else {
                    q.add(q.poll());
                    d1++;
                }
            } else {
                if (ch == 'D') {
                    countd--;
                    q.poll();
                    r1--;
                } else {
                    q.add(q.poll());
                    r1++;
                }
            }
//            System.out.println(q);
        }
    }
}
