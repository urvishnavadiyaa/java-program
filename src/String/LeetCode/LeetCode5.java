package String.LeetCode;

public class LeetCode5 {
    public static void main(String[] args) {
        String s="badabmg";
        int midx=0;
        int i=0;
        int j=0;
        String s1="";
        if (s.length() % 2 == 1) {
            midx= (0 + s.length()-1) /2;
            i=midx;
            j=midx;
        } else {
            midx= (0 + s.length()-1) /2;
            i=midx;
            j=midx+1;
        }
        while (i != -1 || j != s.length()) {
            if (s.charAt(i) != s.charAt(j)) {
                if (s.charAt(i-1) == s.charAt(j)) {
                    s1 += s.substring(i-1,j+1);

                }
            }
        }

    }
}
