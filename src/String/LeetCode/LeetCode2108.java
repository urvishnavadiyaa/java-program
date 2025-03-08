package String.LeetCode;

public class LeetCode2108 {
    public static Boolean checkpali(String s) {
        int i=0;
        int j=s.length()-1;
        while (i<j) {
            if(s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;;
        }
        return true;
    }
    public static void main(String[] args) {
        String s[]={"abc","car","ada","racecar","cool"};
        for (int i = 0; i < s.length; i++) {
            if (checkpali(s[i])) {
                System.out.println(s[i]);
                return;
            }
        }
        System.out.println("there are all string are not palindrome");
    }
}
