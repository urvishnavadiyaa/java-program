package Stack;

import java.util.Stack;

public class ChkPelindrm {
    public static void main(String[] args) {
        String s="nayan";
        Stack<Character> ch = new Stack<>();
        int idx = 0;
        for (int i = s.length()-1; i >= s.length()/2; i--) {
            ch.push(s.charAt(i));
            idx=i-1;
        }
        if (s.length() % 2 == 1) {
            ch.pop();
        }
        while (!ch.isEmpty()) {
            char c = s.charAt(idx);
            if (ch.pop() != c) {
                System.out.println("false");
                return;
            }
            idx--;
        }
        System.out.println("true");
    }
}
