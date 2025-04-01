package Stack.LeetCode;

import java.util.Arrays;
import java.util.Stack;

public class LeetCode224 {
    public static void main(String[] args) {
        String s = "1-(     -2)";
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stk1 = new Stack<>();
        Stack<Character> stk2 = new Stack<>();
        int i = s.length() - 1;
        sb.append('(');
        int count1=0;
        int count2=0;
        while (i >= 0) {
            char c1=s.charAt(i);
            if (c1 == '(') {
                count2++;
                sb.append(')');
            } else if (c1 == ')') {
                count2++;
                sb.append('(');
            } else if (c1 != ' ') {
                if (c1 == '+' || c1 == '-') {
                    count1++;
                }
                sb.append(c1);
            }
            i--;
        }
        if (count1 == count2 && count1 == 0) {
            System.out.println(Integer.parseInt(s));
        }
        sb.append(')');
        System.out.println(sb.toString());
        int j=0;
        while (j < sb.length()) {
            char ch=sb.charAt(j);
            if (ch == ')') {
                if(stk1.size() < 2) {
                    stk2.pop();
                    j++;
                    continue;
                }
                while (stk2.peek() != '(') {
                    int n1=stk1.pop();
                    int n2=stk1.pop();
                    char val=stk2.pop();
//                    if (stk2.peek() == '-' || stk2.peek() == '+') {
//                        if (val == stk2.peek()) {
//                            int n3=n1+n2;
//                            stk1.push(n3);
//                        } else {
//                            int n3=n1-n2;
//                            stk1.push(n3);
//                        }
//                        stk2.pop();
//                    }
                    if (val == '+') {
                        int n3=n1+n2;
                        stk1.push(n3);
                    } else {
                        int n3=n1-n2;
                        stk1.push(n3);
                    }
                }
                stk2.pop();
            } else {
                if(ch >= '0' && ch <= '9') {
                    stk1.push( ch - '0');
                } else if (ch == '(') {
                    stk2.push(ch);
                } else {
                    stk2.push(ch);
                }
            }
            j++;
        }
        System.out.println(stk1.pop());
    }
}
