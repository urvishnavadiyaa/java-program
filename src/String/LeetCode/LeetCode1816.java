package String.LeetCode;

public class LeetCode1816 {
    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        String s1 = "";
        int k = 4;
        int count =0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') {
                count++;
            }
            if(count == k) {
                for (int j = 0; j < i; j++) {
                    s1 += s.charAt(j);
                }
                System.out.println(s1);
                return;
            }
        }
    }
}





































































