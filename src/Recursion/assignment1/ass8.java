package Recursion.assignment1;

public class ass8 {
    public static void main(String[] args) {
        int n = 3;
        generateBinary("", n);
    }

    private static void generateBinary(String prefix, int n) {
        if (n == 0) {
            System.out.println(prefix);
            return;
        }
        generateBinary(prefix + "0", n - 1);
        generateBinary(prefix + "1", n - 1);
    }
}
