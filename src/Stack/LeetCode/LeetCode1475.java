package Stack.LeetCode;

import java.util.Arrays;
import java.util.Stack;

public class LeetCode1475 {
    public static void main(String[] args) {
        int arr[]={10,1,1,6};
        Stack<Integer> stk = new Stack<>();

        int i=arr.length-1;
        while (i > -1) {
            int g=arr[i];
            if (!stk.isEmpty() && arr[i] < stk.peek()) {
                while (!stk.isEmpty() && arr[i] < stk.peek()) {
                    stk.pop();
                }
                if (stk.isEmpty()) {
                    stk.push(arr[i]);
                } else {
                    arr[i] -= stk.peek();
                    stk.push(g);
                }
            } else {
                if (stk.isEmpty()) {
                    stk.push(arr[i]);
                } else {
                    while (arr[i] < stk.peek()) {
                        stk.pop();
                    }
                    arr[i] -= stk.peek();
                    stk.push(g);
                }
            }
            i--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
