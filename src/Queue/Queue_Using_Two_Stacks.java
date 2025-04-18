package Queue;

import java.util.Stack;

public class Queue_Using_Two_Stacks {
    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();

    public static void insertHeavy(int val) {
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        s1.push(val);
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }

    public static void deleteLose() {
        s1.pop();
    }

    public static void deleteHeavy() {
        while (s1.size() != 1) {
            s2.push(s1.pop());
        }
        s1.pop();
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }

    public static void insertLose(int val) {
        s1.push(val);
    }

    public static void main(String[] args) {
        insertHeavy(10);
        insertHeavy(20);
        insertHeavy(30);
        deleteLose();
        System.out.println(s1);
    }
}
