package Recursion.LeetCode;

public class LeetCode342 {
    public static void main(String[] args) {
        System.out.println(isPowerOfFour(16));
    }
    public static boolean isPowerOfFour(int n) {
        if (n == 1) {
            return true;
        }
        if (n % 4 != 0 || n < 4) {
            return false;
        }
        return isPowerOfFour(n/4);
    }
}
