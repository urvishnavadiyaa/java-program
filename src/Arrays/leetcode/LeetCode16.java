package Arrays.leetcode;
import java.util.Arrays;

public class LeetCode16 {
    public static void main(String[] args) {
        int digits[]={9};
        for(int i = digits.length - 1; i >= 0; i--) {
            if(digits[i] < 9) {
                digits[i] = digits[i]+1;
                System.out.println(Arrays.toString(digits));
                return;
            }
            digits[i] = 0;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        System.out.println(Arrays.toString(digits));
    }
}
