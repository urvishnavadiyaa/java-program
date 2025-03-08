package String.assingment2;

public class p2 {
    public static void main(String[] args) {
        String s="1234";
        int ans=0;

        for (int i = 0; i < s.length(); i++) {
            ans *= 10;
            ans += s.charAt(i) - '0';
        }
        System.out.println(ans);
    }
}
