package Stack;

import java.util.Stack;

public class BalParanthesses {
    public static void main(String[] args) {
        String s ="{}[](){{[[(())]]}}";
        Stack<Character> ch = new Stack<>();
        int i=0;
        while (i < s.length()) {
            char c=s.charAt(i);
            if (c == ')' || c == '}' || c == ']') {
                if (ch.isEmpty()) {
                    System.out.println("not balanced");
                    return;
                }
                char j = ch.pop();
                if ((c == ')' && j != '(') || (c == '}' && j != '{') || (c == ']' && j != '[')) {
                    System.out.println("not balanced");
                    return;
                }
            } else {
                ch.push(c);
            }
            i++;
        }
        if (!ch.isEmpty()) {
            System.out.println("not balanced");
            return;
        }
        System.out.println("balanced");
    }
}
