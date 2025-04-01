package Stack.LeetCode;
import java.util.Arrays;
import java.util.Stack;

public class LeetCode735 {
    public static void main(String[] args) {
        int arr[]={-2,1,-1,-2};
        Stack<Integer> stk = new Stack<>();
        int i=0;
        while (arr[i] < 0 ) {
            stk.push(arr[i]);
            i++;
        }
        while (i < arr.length) {
            int val = Math.abs(arr[i]);
            int stkval = Math.abs(stk.peek());
            if (arr[i] > 0) {
                stk.push(arr[i]);
                i++;
            } else {
                if (!stk.isEmpty()) {
                    if (val == stkval) {
                        stk.pop();
                        i++;
                    } else if (val < stkval) {
                        i++;
                    } else {
                        if (stkval < val) {
                            stk.pop();
                        }
                        if (val >= stk.peek() || val >= stk.peek()) {
                            stk.push(arr[i]);
                        }
                    }
                } else {
                    stk.push(arr[i]);
                }
            }
        }
        Integer[] integerArray = stk.toArray(new Integer[0]);
        int[] intArray = Arrays.stream(integerArray).mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(intArray));
    }
}
