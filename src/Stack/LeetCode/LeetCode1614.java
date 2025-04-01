package Stack.LeetCode;

import java.util.Stack;

public class LeetCode1614 {
    public static void main(String[] args) {
        String s = "()(())((()()))";
        Stack<Character> stk = new Stack<>();
        int i=0;
        int maxnum=-1;
        while (i <s.length()) {
            char ch=s.charAt(i);
            if (ch == ')') {
                maxnum = Math.max(maxnum,stk.size());
                int c=0;
                    stk.pop();
            } else if (ch == '('){
                stk.push(ch);
            }
            i++;
        }
        System.out.println(maxnum);
    }
}
