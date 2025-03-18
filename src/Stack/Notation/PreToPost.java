package Stack.Notation;

import java.util.Stack;

public class PreToPost {
    public static void main(String[] args) {
        String s="*+AB-CD";
        Stack<String> stk = new Stack<>();

        int i=s.length()-1;
        while (i >= 0) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z' || ch >= '0' && ch <= '9') {
                stk.push(Character.toString(ch));
            } else {
                String s1=stk.pop();
                String s2=stk.pop();
                String s3=s1 + s2 + ch;
                stk.push(s3);
            }
            i--;
        }
        System.out.println(stk.pop());
    }
}
