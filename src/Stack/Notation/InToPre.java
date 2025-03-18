package Stack.Notation;

import java.util.Stack;

public class InToPre {
    public static int priority(char ch) {
        switch (ch) {
            case '+' : case '-' : return 1;
            case '*' : case '/' : return 2;
            case '^' : return 3;
            default : return -1;
        }
    }
    public static void main(String[] args) {
        String s="(A+B)*(C-D)";
        String s1 ="";
        for (int i = s.length()-1; i >=0; i--) {
            if (s.charAt(i) == '(') {
                s1 += ')';
            } else if (s.charAt(i) == ')') {
                s1 += '(';
            } else {
                s1 += s.charAt(i);
            }
            }
        StringBuilder sb = new StringBuilder("");
        Stack<Character> stk = new Stack<>();
        int i=0;
        while (i <s1.length()) {
            char ch = s1.charAt(i);
            if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z' || ch >= '0' && ch <= '9') {
                sb.append(ch);
            } else if (ch == '(') {
                stk.push(ch);
            } else if (ch == ')') {
                while (!stk.isEmpty() && stk.peek() != '(') {
                    sb.append(stk.pop());
                }
                stk.pop();
            } else {
                while (!stk.isEmpty() && priority(ch) < priority(stk.peek())) {
                    sb.append(stk.pop());
                }
                stk.push(ch);
            }
            i++;
        }
        while (!stk.isEmpty()) {
            sb.append(stk.pop());
        }
        System.out.println(sb.reverse());
    }
}
