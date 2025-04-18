package Queue.LeetCode;

import java.util.LinkedList;
import java.util.Queue;

public class LeetCode387 {
    public static void main(String[] args) {
        String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        int freq[] =new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if(freq[s.charAt(i) - 'a'] == 1) {
                System.out.println(i);
                return;
            }
        }
        System.out.println("-1");
//        Queue<Character> q1 = new LinkedList<>();
//        Queue<Character> q2 = new LinkedList<>();
//        int j=0;
//        while (j != s.length()) {
//            q1.add(s.charAt(j));
//            j++;
//        }
//
//        for (int i = 0; i < s.length(); i++) {
//            while (!q1.isEmpty()) {
//                if (q1.peek() != s.charAt(i)) {
//                    q2.add(q1.poll());
//                } else {
//                    break;
//                }
//            }
//            int c=0;
//            if (q1.isEmpty()) {
//                System.out.println(i);
//                return;
//            } else {
//                while (!q1.isEmpty()) {
//                    if (q1.peek() != s.charAt(i)) {
//                        q2.add(q1.poll());
//                    } else {
//                        q1.poll();
//                        c++;
//                    }
//                }
//            }
//            i=i+c;
//            q1 = q2;
//            q2 = new LinkedList<>();
//        }
    }
}
