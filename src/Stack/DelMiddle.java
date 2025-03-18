package Stack;

import java.util.Stack;

public class DelMiddle {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        Stack<Integer> stack1 = new Stack<>();
        while (stack.size() > stack1.size()) {
            stack1.push(stack.pop());
        }
        System.out.println(stack1.pop());
    }
}
