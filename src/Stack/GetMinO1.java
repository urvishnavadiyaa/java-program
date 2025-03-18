package Stack;
import java.util.Stack;

class MinStack {
    private Stack<Integer> mainStack = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();

    public void push(int x) {
        mainStack.push(x);
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    public void pop() {
        if (mainStack.isEmpty()) throw new RuntimeException("Stack is empty");

        int popped = mainStack.pop();
        if (popped == minStack.peek()) {
            minStack.pop();
        }
    }

    public int top() {
        if (mainStack.isEmpty()) throw new RuntimeException("Stack is empty");
        return mainStack.peek();
    }

    public int getMin() {
        if (minStack.isEmpty()) throw new RuntimeException("Stack is empty");
        return minStack.peek();
    }
}
public class GetMinO1 {
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
