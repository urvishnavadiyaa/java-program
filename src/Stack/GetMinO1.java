package Stack;
import java.util.Stack;

class Stacks {
    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();
    static int minvalue = 0;

    public static void push(int val) {
        s1.push(val);
        if (s2.isEmpty() || val <= s2.peek()) {
            s2.push(val);
        }
    }
    public static void pop() {
        int popval = s1.pop();
        if (popval == s2.peek()) {
            s2.pop();
        }
    }
    public static int getMin() {
        return s2.peek();
    }
}
public class GetMinO1 {
    public static void main(String[] args) {
//        Stacks s = new Stacks();
        Stacks.push(32);
        System.out.println(Stacks.getMin());
        Stacks.push(22);
        System.out.println(Stacks.getMin());
        Stacks.push(65);
        System.out.println(Stacks.getMin());
        Stacks.push(345);
        System.out.println(Stacks.getMin());
        Stacks.pop();
        System.out.println(Stacks.getMin());
        Stacks.pop();
        System.out.println(Stacks.getMin());
        Stacks.push(6);
        System.out.println(Stacks.getMin());
    }
}
