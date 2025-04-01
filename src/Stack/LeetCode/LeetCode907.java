package Stack.LeetCode;
import java.util.Arrays;
import java.util.Stack;

public class LeetCode907 {
    public static int[] findNGE(int arr[],int arr1[],Stack<Integer> stk1) {
        for (int i = arr.length-1; i >= 0; i--) {
            while (!stk1.isEmpty() && arr[stk1.peek()] >= arr[i]) {
                stk1.pop();
            }
            if (stk1.isEmpty()) {
                arr1[i] = arr.length;
            } else {
                arr1[i] = stk1.peek();
            }
            stk1.push(i);
        }
        return arr1;
    }

    public static int[] findPSE(int arr[], int arr2[], Stack<Integer> stk2) {
        for (int i = 0; i < arr.length; i++) {
            while (!stk2.isEmpty() && arr[stk2.peek()] > arr[i]) {
                stk2.pop();
            }
            if (stk2.isEmpty()) {
                arr2[i] = -1;
            } else {
                arr2[i] = stk2.peek();
            }
            stk2.push(i);
        }
        return arr2;
    }
    public static void main(String[] args) {
        int arr[] = {3,1,2,4};
        int arr1[] = new int[arr.length];
        int arr2[] = new int[arr.length];
        Stack<Integer> stk1=new Stack<>();
        Stack<Integer> stk2=new Stack<>();
        int total = 0;
        long l = 1000000007;
        arr1 = findNGE(arr,arr1,stk1);
        arr2 = findPSE(arr,arr2,stk2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        for (int i = 0; i < arr.length; i++) {
            int left=i-arr2[i];
            int right=arr1[i]-i;
            total = (int) ((total + ((long) right * left * arr[i]) % l) % l);
        }
        System.out.println(total);
    }
}
