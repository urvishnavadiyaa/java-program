package String.LeetCode;

import java.util.Arrays;

public class LeetCode14 {
    public static void main(String[] args) {
        String s[]={"flower","hbflow","flight"};
        StringBuilder ans = new StringBuilder();
        Arrays.sort(s);
        String st=s[0];
        String end=s[s.length-1];
        for (int i = 0; i < Math.min(st.length(),end.length()); i++) {
            if(st.charAt(i) != end.charAt(i)) {
                System.out.println(ans.toString());
                return;
            }
            ans.append(st.charAt(i));
        }
        System.out.println(ans.toString());
    }
}
