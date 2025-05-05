package Recursion.assignment1;

public class ass6 {
    public static void main(String[] args) {
        String s = "abc";
        findSubset(s, new String(""), 0);
    }

    private static void findSubset(String s, String s1, int i) {
        if (i == s.length()) {
            System.out.println(s1);
            return;
        }
        findSubset(s, s1+s.charAt(i), i+1);
        findSubset(s, s1, i+1);
    }
}
