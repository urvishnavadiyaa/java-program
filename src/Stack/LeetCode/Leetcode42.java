package Stack.LeetCode;

import java.util.Arrays;
import java.util.Stack;

public class Leetcode42 {
    public static int[] mostGreaterRight(int arr[],int arr1[],Stack<Integer> stk1) {
        int max=0;
        arr1[0]=-1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[max]) {
                arr1[i]=-1;
                max=i;
            } else {
                arr1[i]=max;
            }
        }
        return arr1;
    }

    public static int[] mostGreaterLeft(int arr[],int arr2[],Stack<Integer> stk1) {
        int max=arr.length-1;
        arr2[arr.length-1]=-1;
        for (int i = arr.length-2; i >= 0; i--) {
            if (arr[i] >= arr[max]) {
                arr2[i]=-1;
                max=i;
            } else {
                arr2[i]=max;
            }
        }
        return arr2;
    }
    public static void main(String[] args) {
        int arr[]={4,2,0,3,2,5};
        int arr1[] = new int[arr.length];
        int arr2[] = new int[arr.length];
        Stack<Integer> stk1 = new Stack<>();
        Stack<Integer> stk2 = new Stack<>();
        arr1 = mostGreaterRight(arr,arr1,stk1);
        arr2 = mostGreaterLeft(arr,arr2,stk2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        int totalTrap=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr1[i] != -1 && arr2[i] != -1) {
                int idx=Math.min(arr[arr1[i]],arr[arr2[i]]);
                totalTrap += idx - arr[i];
            }
        }
        System.out.println(totalTrap);
    }
}
