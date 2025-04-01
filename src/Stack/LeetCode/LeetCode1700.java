package Stack.LeetCode;

import java.util.Stack;

public class LeetCode1700 {
    public static void main(String[] args) {
        int students[]={1,1,1,0,0,1};
        int sandwiches[]={1,0,0,0,1,1};
        Stack<Integer> stk = new Stack<>();
        int c0=0;
        int c1=0;
        for (int i = students.length-1; i >= 0; i--) {
            stk.push(sandwiches[i]);
            if (students[i] == 0) {
                c0++;
            } else {
                c1++;
            }
        }
        while (c0 != 0 && c1 != 0) {
            if (stk.peek() == 0 && c0 > 0) {
                c0--;
                stk.pop();
            } else if (stk.peek() == 1 && c1 > 0) {
                c1--;
            } else {
                break;
            }
        }

        while (!stk.isEmpty()) {
            System.out.println(stk.size());
            return;
        }
        System.out.println("0");
    }
}
