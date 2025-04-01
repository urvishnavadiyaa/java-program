package Stack.LeetCode;

import java.util.Stack;

public class LeetCode1047 {
    public static void main(String[] args) {
        String s = "abbaca";
        Stack<Character> stk = new Stack<>();

        int i=s.length()-1;
        while (i != -1) {
            char ch=s.charAt(i);
            if (!stk.isEmpty() && ch == stk.peek()) {
                stk.pop();
            } else {
                stk.push(ch);
            }
            i--;
        }
        StringBuilder s1 = new StringBuilder();
        while (!stk.isEmpty()) {
            s1.append(stk.pop());
        }
        System.out.println(s1.toString());
    }
}
