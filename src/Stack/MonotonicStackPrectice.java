package Stack;

import java.util.Arrays;
import java.util.Stack;

public class MonotonicStackPrectice {
    public static void main(String[] args) {
        int arr[]={3,1,4,1,5,9,2,6};
        Stack<Integer> stk = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!stk.isEmpty() && stk.peek() < arr[i]) {
                stk.pop();
            }
            stk.push(arr[i]);
        }
        int res[] = new int[stk.size()];
        int i=stk.size()-1;
        while (!stk.isEmpty())  {
            res[i] = stk.pop();
            i--;
        }
        System.out.println(Arrays.toString(res));
    }
}
