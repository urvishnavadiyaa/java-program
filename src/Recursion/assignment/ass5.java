package Recursion.assignment;

public class ass5 {
    public static void main(String[] args) {
        int num = 267872846;
        System.out.println(countDegit(num));
    }

    private static int countDegit(int num) {
        if (num == 0) {
            return 0;
        }
        return 1 + countDegit(num / 10);
    }
}
