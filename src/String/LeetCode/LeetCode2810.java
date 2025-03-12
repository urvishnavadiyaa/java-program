package String.LeetCode;

public class LeetCode2810 {   //ASC -> O(n*i)
    public static String revString(String s,int st, int end) {
        String str ="";
        for (int i = st; i >= end; i--) {
            str += s.charAt(i);
        }
        for (int i = st+2; i < s.length(); i++) {
            str += s.charAt(i);
        }
        return str;
    }
    public static void main(String[] args) {
        String s="scefsdiiiii";
        int i = 0;
        while (i < s.length()) {
            if(s.charAt(i) == 'i') {
                s = revString(s, i - 1, 0);
            } else {
                i++;
            }
        }
        System.out.println(s);
    }
}
