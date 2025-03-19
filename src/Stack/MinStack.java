package Stack;
import java.util.Stack;

public class MinStack {
    static Stack<Integer> stack = new Stack<>();
    static int minVal;

    public void push(int x) {
        if (stack.isEmpty()) {
            minVal = x;
            stack.push(x);
        } else if (x < minVal) {
            stack.push(2 * x - minVal);
            minVal = x;
        } else {
            stack.push(x);
        }
    }

    public void pop() {
        int top = stack.pop();
        if (top < minVal) {
            minVal = 2 * minVal - top;
        }
    }

    public int top() {
        int top = stack.peek();
        return (top < minVal) ? minVal : top;
    }

    public int getMin() {
        return minVal;
    }

    public static void main(String[] args) {
        MinStack s = new MinStack();

        s.push(5);
        System.out.println(s.getMin());
        s.push(2);
        System.out.println(s.getMin());
        s.push(8);
        System.out.println(s.getMin());
        s.pop();
        System.out.println(s.getMin());
        s.pop();
        System.out.println(s.getMin());
        s.pop();
    }
}
