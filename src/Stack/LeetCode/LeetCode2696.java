package Stack.LeetCode;

import java.util.Stack;

public class LeetCode2696 {
    public static void main(String[] args) {
        String s="BJKDKABJ";
        Stack<Character> stk = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch =s.charAt(i);
            if (!stk.isEmpty() && (ch == 'B' && stk.peek() == 'A' || ch == 'D' && stk.peek() == 'C')) {
                stk.pop();
            } else {
                stk.push(ch);
            }
        }
        System.out.println(stk.size());
    }
}
