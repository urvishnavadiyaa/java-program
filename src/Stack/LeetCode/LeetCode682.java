package Stack.LeetCode;
import java.util.Stack;

public class LeetCode682 {
    public static void main(String[] args) {
        String s[] ={"5","-2","4","C","D","9","+","+"};
        Stack<Integer> ch = new Stack<>();
        int total=0;
        for (int i = 0; i < s.length; i++) {
            if (s[i].equals("+")) {
                int m = ch.peek();
                int k = ch.pop();
                int n = ch.peek();
                ch.push(k);
                total += m + n;
                ch.push(m + n);
            } else if (s[i].equals("C")) {
                total -= ch.pop();
            } else if (s[i].equals("D")) {
                total += 2 * ch.peek();
                ch.push(2 * ch.peek());
            } else {
                int num = Integer.parseInt(s[i]);
                ch.push(num);
                total += ch.peek();
            }
        }
        System.out.println(total);
    }
}
