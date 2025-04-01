package Stack.LeetCode;

import java.util.Stack;

public class LeetCode402 {
    public static void main(String[] args) {
        String s="112";
        int k=1;
        System.out.println(removeKdigits(s,k));
    }
    public static String removeKdigits(String s, int k) {
        if (k == s.length()) {
            return "0";
        }
        Stack<Character> stk = new Stack<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char ch=s.charAt(i);
            while (k != 0 && !stk.isEmpty() && stk.peek() > ch) {
                stk.pop();
                k--;
            }
            stk.push(ch);
        }
        while (k > 0 && !stk.isEmpty()) {
            stk.pop();
            k--;
        }
        StringBuilder sb = new StringBuilder();
        while (!stk.isEmpty()) {
            sb.append(stk.pop());
        }
        sb.reverse();
        while (sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        return sb.length() > 0 ? sb.toString() : "0";
    }
}
