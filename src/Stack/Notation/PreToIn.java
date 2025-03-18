package Stack.Notation;

import java.util.Stack;

public class PreToIn {
    public static void main(String[] args) {
        String s = "*+ab-cd";
//        String s1 ="";
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
        int i = s.length()-1;
        while (i >= 0) {
            char ch=s.charAt(i);
            if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z' || ch >= '0' && ch <= '9') {
                stk.push(Character.toString(ch));
            } else {
                String s1=stk.pop();
                String s2=stk.pop();
                String s3= '(' + s1 + ch + s2 + ')';
                stk.push(s3);
            }
            i--;
        }
        System.out.println(stk.pop());
    }
}
