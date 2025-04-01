package Stack.LeetCode;

import java.util.Arrays;
import java.util.Stack;

public class LeetCode503 {
    public static void main(String[] args) {
        int arr[] = {1,1,1,1,1};
//        int A[] = {1,2,3,2,1};
//        public int[] nextGreaterElements(int[] nums) {
//        Stack<Integer> st = new Stack<>();
//        int[] res = new int[nums.length];
//        for(int i=2*nums.length-1; i>=0; i--){
//            int index = i%nums.length;
//            while(!st.isEmpty() && st.peek() <= nums[index]){
//                st.pop();
//            }
//            if(st.isEmpty()){
//                res[index]=-1;
//            }else{
//                res[index]=st.peek();
//            }
//            st.push(nums[index]);
//        }
//        return res;
//    }
        Stack<Integer> stk = new Stack<>();
        int ans[] = new int[arr.length];

        for (int i = arr.length-1; i >= 0; i--) {
            if (!stk.isEmpty()) {
                while (!stk.isEmpty() && stk.peek() <= arr[i]) {
                    stk.pop();
                }
                if (stk.isEmpty()) {
                    ans[i] = Integer.MIN_VALUE;
                } else {
                    ans[i] = stk.peek();
                }
                stk.push(arr[i]);
            } else {
                stk.push(arr[i]);
                ans[i] = Integer.MIN_VALUE;
            }
        }
        while (!stk.isEmpty()) {
            stk.pop();
        }
        for (int i = 0; i < arr.length; i++) {
            if (!stk.isEmpty()) {
                while (!stk.isEmpty() && stk.peek() <= arr[i]) {
                    stk.pop();
                }
                if (stk.isEmpty()) {
                    if (ans[i] == Integer.MIN_VALUE) {
                        ans[i] = Integer.MIN_VALUE;
                    }
                } else {
                    if (ans[i] == Integer.MIN_VALUE) {
                        ans[i] = stk.peek();
                    }
                }
                if (!stk.isEmpty() && stk.peek() < arr[i]) {
                    stk.pop();
                    stk.push(arr[i]);
                } else if (stk.isEmpty()) {
                    stk.push(arr[i]);
                }
            } else {
                stk.push(arr[i]);
            }
        }
        for (int i = 0; i < ans.length; i++) {
            if (ans[i] == Integer.MIN_VALUE) {
                ans[i] = -1;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
