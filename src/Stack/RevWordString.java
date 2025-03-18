package Stack;

public class RevWordString {
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
    public static void revStringStack(String s,char stack[]) {
        int top=-1;
        for (int i = 0; i < s.length(); i++) {
            while (s.charAt(i) != ' ') {
                top = push(stack,top,s.charAt(i));
                i++;
                if (i == s.length()) {
                    break;
                }
            }
            while (top != -1) {
                char val = pop(stack,top);
                System.out.print(val);
                top--;
            }
            System.out.print(' ');
        }
    }
    public static void main(String[] args) {
        int top=-1;
        String s="hello how are you java";
        char stack[] = new char[s.length()];
        revStringStack(s,stack);
    }
}


