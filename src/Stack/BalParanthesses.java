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
            if (i == s.length()-1 && !ch.isEmpty()) {
                System.out.println("not balanced");
                return;
            }
            i++;
        }
        System.out.println("balanced");
    }
}
