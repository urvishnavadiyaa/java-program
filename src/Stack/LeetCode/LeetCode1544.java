package Stack.LeetCode;

import java.util.Stack;

public class LeetCode1544 {
    public static void main(String[] args) {
        String s="leEeetcode";
        Stack<Character> stk = new Stack<>();
        int i=0;
        while (i < s.length()) {
            if (!stk.isEmpty() && Math.abs(s.charAt(i) - stk.peek()) == 32) {
                stk.pop();
            } else {
                stk.push(s.charAt(i));
            }
            i++;
        }
        StringBuilder sb = new StringBuilder();
        while (!stk.isEmpty()) {
            sb.insert(0, stk.pop());
        }
        System.out.println(sb);
    }
}
