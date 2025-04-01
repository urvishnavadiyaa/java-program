package Stack;

import java.util.Arrays;
import java.util.Stack;

public class TwoStackInOneArr {

    public static int push1(int arr[],int top1,int top2,int val) {
        top1++;
        if (top1 == top2) {
            return -1;
        }
        arr[top1] = val;
        return top1;
    }
    public static int push2(int arr[],int top1,int top2,int val) {
        top2--;
        if (top1 == top2) {
            return -1;
        }
        arr[top2] = val;
        return top2;
    }
    public static int pop1(int top1) {
        if (top1 == -1) {
            System.out.println("Stack1 is Empty");
            return -1;
        }
        top1--;
        return top1;
    }
    public static int pop2(int top2) {
        if (top2 == -1) {
            System.out.println("Stack1 is Empty");
            return -1;
        }
        top2++;
        return top2;
    }
    public static int peek1(int arr[],int top1) {
        if (top1 != -1) {
            return arr[top1];
        }
        return -1;
    }
    public static int peek2(int arr[],int top2) {
        if (top2 != -1) {
            return arr[top2];
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = new int[10];
        int top1=-1;
        int top2=arr.length;
        top1=push1(arr,top1,top2,43);
        top2=push2(arr,top1,top2,56);
        top1=push1(arr,top1,top2,34);
        top2=push2(arr,top1,top2,65);
        top1=pop1(top1);
        top2=pop2(top2);
        top2=push2(arr,top1,top2,51);
        top2=push2(arr,top1,top2,564);
        top1=push1(arr,top1,top2,347);
        System.out.println(peek1(arr,top1));
        System.out.println(peek2(arr,top2));
        System.out.println(Arrays.toString(arr));
    }
}
