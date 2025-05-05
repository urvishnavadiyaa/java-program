package Recursion.assignment;

public class ass6 {
    public static void main(String[] args) {
        int num = 267872846;
        System.out.println(sumOfDegit(num));
    }
    private static int sumOfDegit(int num) {
        if (num == 0) {
            return 0;
        }
        int n = num % 10;
        return n + sumOfDegit(num / 10);
    }
}
