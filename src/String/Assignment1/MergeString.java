package String.Assignment1;

public class MergeString {
    public static void main(String[] args) {
        String s1 = "naman";
        String s2 = "mohan";
        char ch[]=new char[s1.length()+s2.length()];
        int idx=0;
        for (int i = 0; i < ch.length; i+=2) {
            ch[i] = s1.charAt(idx);
            ch[i+1] = s2.charAt(idx);
            idx++;
        }
        String newstr = new String(ch);
        System.out.println(newstr);
    }
}
