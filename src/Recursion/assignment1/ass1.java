package Recursion.assignment1;

public class ass1 {
    public static void main(String[] args) {
        String s = "nayan";
        System.out.println(isPellindrome(s ,0 , s.length()-1));
    }

    private static boolean isPellindrome(String s, int i, int j) {
        if (i >= j) {
            return true;
        }
        if (s.charAt(i) != s.charAt(j)) {
            return false;
        }
        return isPellindrome(s, i+1, j-1);
    }
}
