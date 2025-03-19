package Stack.LeetCode;

import java.util.Stack;

public class LeetCode150 {
    public static void main(String[] args) {
        String s[] = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        int totalsum = evalRPN(s);
        System.out.println(totalsum);
    }
    public static int evalRPN(String[] s) {
        int sum=Integer.MIN_VALUE;
//        if (s[0] == "+" || s[0] == "-" || s[0] == "*" || s[0] == "/") {
//            int i=s.length-1;
//            preSum(s,i);
//        } else {
            int j=0;
            sum = postSum(s,j);
//        }
        return sum;
    }
//    public static int preSum(String s[],int i) {
//        for (int j = i; j >= 0; j--) {
//
//        }
//    }
    public static int postSum(String s[],int j) {
        Stack<Integer> s1 = new Stack<>();
        for (int i = j; i < s.length; i++) {
            if (s[i] == "+" || s[i] == "-" || s[i] == "*" || s[i] == "/") {
                int num1=s1.pop();
                int num2=s1.pop();
                int newnum= applyOperator(num1,num2,s[i]);
                s1.push(newnum);
            } else {
                s1.push(Integer.parseInt(s[i]));
            }
        }
        return s1.peek();
    }
    public static int applyOperator(int num1, int num2, String op) {
        switch (op) {
            case "+": return num2 + num1;
            case "-": return num2 - num1;
            case "*": return num2 * num1;
            case "/": return (num2 != 0) ? num2 / num1 : 0;
            default: throw new IllegalArgumentException("Invalid operator: " + op);
        }
    }
}
