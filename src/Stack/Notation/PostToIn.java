package Stack.Notation;

import java.util.Stack;

public class PostToIn {
    public static void main(String[] args) {
        String s="AB+CD-*";
        Stack<String> stk = new Stack<>();
//        for (int i = s.length()-1; i >=0; i--) {
//            if (s.charAt(i) == '(') {
//                s1 += ')';
//            } else if (s.charAt(i) == ')') {
//                s1 += '(';
//            } else {
//                s1 += s.charAt(i);
//            }
//        }
        int i = 0;
        while (i < s.length()) {
            char ch=s.charAt(i);
            if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z' || ch >= '0' && ch <= '9') {
                stk.push(Character.toString(ch));
            } else {
                String s1=stk.pop();
                String s2=stk.pop();
                String s3= '(' + s2 + ch + s1 + ')';
                stk.push(s3);
            }
            i++;
        }
        System.out.println(stk.pop());
    }
}
