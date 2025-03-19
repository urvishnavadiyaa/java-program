package Stack.LeetCode;

import java.util.Stack;

public class LeetCode844 {
    public static void main(String[] args) {
        String s1="a#c";
        String s2="d";
        Stack<Character> ch1 = new Stack<>();
        Stack<Character> ch2 = new Stack<>();
        int i=0;
        while (i < Math.max(s1.length(),s2.length())) {
            if (i < s1.length()) {
                if (s1.charAt(i) == '#') {
                    if (ch1.isEmpty()) {
                        ch1.pop();
                    }
                } else {
                    ch1.push(s1.charAt(i));
                }
            }
            if (i < s2.length()) {
                if (s2.charAt(i) == '#') {
                    if (ch2.isEmpty()) {
                        ch2.pop();
                    }
                } else {
                    ch2.push(s2.charAt(i));
                }
            }
            i++;
        }
        System.out.println(ch1.equals(ch2));
    }
}
