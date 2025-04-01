package Stack.LeetCode;
import java.util.Stack;

public class LeetCode1598 {
    public static void main(String[] args) {
        String arr[]={"./","../","./"};
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].charAt(1) == '.') {
                count--;
            } else {
                if (arr[i].charAt(0) != '.') {
                    count++;
                }
            }
        }
        if (count > 0) {
            System.out.println(count);
        } else {
            System.out.println("0");
        }
    }
}
