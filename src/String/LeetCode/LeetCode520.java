package String.LeetCode;

public class LeetCode520 {
    public static void main(String[] args) {
        String s="USA";
        if (s.charAt(s.length()-1) >= 'A' && s.charAt(s.length()-1) <= 'Z') {
            for (int i = 0; i < s.length(); i++) {
                char ch=s.charAt(i);
                if (ch < 'A' || ch > 'Z') {
                    System.out.println("false");
                    return;
                }
            }
            System.out.println("true");
        } else {
            for (int i = 1; i < s.length(); i++) {
                char ch=s.charAt(i);
                if (ch < 'a' || ch > 'z') {
                    System.out.println("false");
                    return;
                }
            }
            System.out.println("true");
        }
    }
}
