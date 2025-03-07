package String.Assignment1;

public class CheckString {
    public static void main(String[] args) {
        String s1="urvish";
        String s2="urvish";

        if(s1.length() != s2.length()) {
            System.out.println("not same");
            return;
        }
        for (int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i) != s2.charAt(i)) {
                System.out.println("not same");
                return;
            }
        }
        System.out.println("same");
    }
}
