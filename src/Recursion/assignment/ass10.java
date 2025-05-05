package Recursion.assignment;

public class ass10 {
    public static void main(String[] args) {
        int n = 10;
        boolean falg =  checkPrimeNumber(n, n-1);
        if (falg) {
            System.out.println("is prime");
        } else {
            System.out.println("not prime");
        }
    }

    private static boolean checkPrimeNumber(int num, int n) {
        if (n == 1) {
            return true;
        }
        if (num % n == 0) {
            return false;
        }
        return checkPrimeNumber(num, n-1);
    }
}
