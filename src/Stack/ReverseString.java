package Stack;

public class ReverseString {
        public static int push(char stack[],int top,char val) {
            if(top == stack.length-1) {
                System.out.println("stack is overflow");
                return top;
            }
            top++;
            stack[top] = val;
            return top;
        }
        public static char pop(char[] stack, int top) {
            if (top == -1) {
                System.out.println("stack is underflow");
                return ' ';
            }
            char val = stack[top];
            top--;
            return val;
        }
        public static void main(String[] args) {
            int top=-1;
            String s="urvish";
            String s1="hello how are you";
            char stack[]=new char[s.length()];
            for (int i = 0; i < s.length(); i++) {
                top = push(stack,top,s.charAt(i));
            }
            while (top != -1) {
                char val = pop(stack,top);
                System.out.print(val);
                top--;
            }
        }
}
