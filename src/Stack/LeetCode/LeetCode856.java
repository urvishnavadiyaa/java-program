package Stack.LeetCode;

import java.util.Stack;

public class LeetCode856 {
    public static void main(String[] args) {
        String s="()((()(())))";
        Stack<Character> stk =  new Stack<>();
        int i=1;
        int totalscore=0;
        while (i < s.length()) {
            int c1=1;
            int c2=0;
            int flag=0;
            int count=0;
            int c=0;
            stk.push(s.charAt(i-1));
            while (c1 != c2) {
                char ch = s.charAt(i);
                if (ch == '(') {
                    stk.push(ch);
                    if (flag == 1) {
                        count++;
                        c--;
                        flag--;
                    }
                    c1++;
                } else {
                    if (flag == 0) {
                        stk.pop();
                        c++;
                        flag++;
                    } else {
                        stk.pop();
                        count *= 2;
                    }
                    c2++;
                }
                i++;
            }
            totalscore += count;
        }
    }
}
