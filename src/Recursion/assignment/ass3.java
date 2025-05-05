package Recursion.assignment;

public class ass3 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(sumnum(n));
    }

    private static int sumnum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumnum(n-1);
    }
}
