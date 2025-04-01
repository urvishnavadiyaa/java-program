package Stack.LeetCode;

import java.util.Stack;

public class LeetCode32 {
    public static void main(String[] args) {
        String s = "()(()";
        Stack<Character> stk = new Stack<>();
        int i=0;
        int maxlen=0;
        if (s.length() == 0) {
            System.out.println(maxlen);
            return;
        }
        while (i < s.length()) {
            char ch = s.charAt(i);
            if (ch == ')') {
                if (stk.isEmpty()) {
                    i++;
                } else {
                    int j=i;
                    int count=0;
                    while (j < s.length()) {
                        char ch2 = s.charAt(j);
                        if (ch2 == ')') {
                            if (stk.isEmpty()) {
                                break;
                            } else {
                                if (stk.peek() == '(') {
                                    count+=2;
                                    stk.pop();
                                }
                            }
                        } else {
                            stk.push(ch2);
                        }
                        j++;
                    }
                    if(!stk.isEmpty()) {
                        break;
                    }
                    i=j;
                    maxlen = Math.max(maxlen,count);
                }
            } else {
                stk.push(ch);
                i++;
            }
        }
        System.out.println(maxlen);
    }
}
