package Recursion.assignment1;

public class ass7 {
    public static void main(String[] args) {
        String s = "abc";
        Premutation(s, "");
    }

    private static void Premutation(String s, String s1) {
        if (s. length() == 0) {
            System.out.println(s1);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            String str = s.substring(0, i) + s.substring(i+1);
            Premutation(str, s1+curr);
        }
    }
}
