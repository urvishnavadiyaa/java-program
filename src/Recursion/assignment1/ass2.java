package Recursion.assignment1;

public class ass2 {
    public static void main(String[] args) {
        String s = "rahul";
        System.out.println(reverseString(s, new StringBuilder(""), s.length()-1));
    }

    private static String reverseString(String s, StringBuilder rev, int idx) {
        if (idx == -1) {
            return rev.toString();
        }
        rev.append(s.charAt(idx));
        return reverseString(s, rev, idx-1);
    }
}
