package Stack.LeetCode;

import java.util.Stack;

public class LeetCode1021 {
    public static void main(String[] args) {
        String s="(()())(())(()(()))";
        StringBuilder sb = new StringBuilder();
        int i=1;
        int count=1;
        while (i < s.length()) {
            char ch=s.charAt(i);
            if (ch == '(') {
                count++;
                if (count > 1) {
                    sb.append(ch);
                }
            } else {
                if (count > 1) {
                    sb.append(ch);
                }
                count--;
            }
            i++;
        }
        System.out.println(sb.toString());
    }
}
