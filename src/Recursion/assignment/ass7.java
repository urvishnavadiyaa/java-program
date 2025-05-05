package Recursion.assignment;

public class ass7 {
    public static void main(String[] args) {
        int num = 2678;
        System.out.println(reverseInt(num, 0));
    }

    private static int reverseInt(int num, int num2) {
        if (num == 0) {
            return num2;
        }
        int n = num % 10;
        num2 = num2 * 10 + n;
        return reverseInt(num / 10, num2);
    }
}
