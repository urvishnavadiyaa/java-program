package String.LeetCode;

public class LeetCode2810 {   //ASC -> O(n*i)
    public static String revString(char s[],int st, int end) {
        String str ="";
        for (int i = st; i >= end; i--) {
            str += s[i];
        }
        for (int i = st+2; i < s.length; i++) {
            str += s[i];
        }
        return str;
    }
    public static void main(String[] args) {
        String s="scefsdiiiii";
//        String s1=s;
        int i = 0;
        while (i < s.length()) {
            if(s.charAt(i) == 'i') {
                char ch[] = s.toCharArray();
                s = revString(ch, i - 1, 0);
            } else {
                i++;
            }
        }
        System.out.println(s);
    }
}
