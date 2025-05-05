package Recursion.assignment;

public class ass8 {
    public static void main(String[] args) {
        int n1 = 26;
        int n2 = 14;
        int num2 = Math.max(n1, n2);
        int num1 = Math.min(n1, n2);
        System.out.println(productOfNum(num1, num2));
    }

    private static int productOfNum(int n1, int n2) {
        if (n1 == 1) {
            return n2;
        }
        return n2 + productOfNum(n1 - 1, n2);
    }
}
