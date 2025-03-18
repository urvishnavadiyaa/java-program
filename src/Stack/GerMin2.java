package Stack;

import java.util.Stack;

public class GerMin2 {
    private Stack<Integer> stack = new Stack<>();
    private int minValue;

    public void push(int x) {
        if (stack.isEmpty()) {
            minValue = x;
            stack.push(x);
        } else if (x < minValue) {
            stack.push(2 * x - minValue);
            minValue = x;
        } else {
            stack.push(x);
        }
    }

    public void pop() {
        if (stack.isEmpty()) throw new RuntimeException("Stack is empty");

        int top = stack.pop();
        if (top < minValue) {
            minValue = 2 * minValue - top;
        }
    }

    public int top() {
        if (stack.isEmpty()) throw new RuntimeException("Stack is empty");

        int top = stack.peek();
        return (top < minValue) ? minValue : top;
    }

    public int getMin() {
        if (stack.isEmpty()) throw new RuntimeException("Stack is empty");
        return minValue;
    }

    public static void main(String[] args) {
        MinStack s = new MinStack();

        s.push(5);
        System.out.println("Min: " + s.getMin());

        s.push(2);
        System.out.println("Min: " + s.getMin());

        s.push(8);
        System.out.println("Min: " + s.getMin());

        s.pop();
        System.out.println("Min: " + s.getMin());

        s.pop();
        System.out.println("Min: " + s.getMin());

        s.pop();
    }
}
