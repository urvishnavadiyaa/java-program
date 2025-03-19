package Stack.LeetCode;

import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class LeetCode496 {
    public static void main(String[] args) {
        int num1[]={4,1,2} , num2[] = {1,3,4,2};
        int arr[] = nextGreaterElement(num1,num2);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        int i=0;
        while (i < nums2.length) {
            stack2.push(nums2[i]);
            i++;
        }
        int j=0;
        while (j < nums1.length) {
            int max=-1;
            while (stack2.peek() != nums1[j]) {
                int a = stack2.pop();
                stack1.push(a);
                if (nums1[j] < a) {
                    max = a;
                }
            }
            nums1[j] = max;
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
            j++;
        }
        return nums1;
    }
}