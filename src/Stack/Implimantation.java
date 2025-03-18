package Stack;
import java.util.Arrays;

public class Implimantation {
    public static int push(int stack[],int top,int val) {
        if(top == stack.length-1) {
            System.out.println("stack is overflow");
            return top;
        }
        top++;
        stack[top] = val;
        return top;
    }
    public static int pop(int top) {
        if (top == -1) {
            System.out.println("stack is underflow");
            return top;
        }
        top--;
        return top;
    }
    public static int peek(int stack[],int top) {
        return stack[top];
    }

    public static int size(int top) {
        return top+1;
    }
    public static boolean isEmpty(int top) {
        if(top == -1) {
            return true;
        }
        return false;
    }
    public static void printstack(int stack[],int top) {
        while (top != -1) {
            System.out.print(stack[top]+" ");
            top--;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int stack[] = new int[5];
        int top=-1;
        top = push(stack,top,10);
        top = push(stack,top,20);
        top = push(stack,top,30);
        top = push(stack,top,40);
        top = push(stack,top,50);
        top = pop(top);
        top = pop(top);
        top = push(stack,top,70);
        boolean is=isEmpty(top);
        int val=peek(stack,top);
        int size=size(top);
        printstack(stack,top);
        System.out.println(size);
        System.out.println(val);
        System.out.println(is);
        System.out.println(Arrays.toString(stack));
    }
}
