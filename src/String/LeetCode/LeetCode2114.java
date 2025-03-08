package String.LeetCode;

public class LeetCode2114 {
    public static int countWord(String s){
        int c=1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                c++;
            }
        }
        return c;
    }
    public static void main(String[] args) {
        int count=0,maxcount=0;
        String s[]={"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        for (int i = 0; i < s.length; i++) {
            count=countWord(s[i]);
            maxcount=Math.max(maxcount,count);
        }
        System.out.println(maxcount);
    }
}
