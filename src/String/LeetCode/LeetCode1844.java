package String.LeetCode;

public class LeetCode1844 {
    public static void main(String[] args) {
        String s = "a1b2c3d4e";
        char ch[] =s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if(ch[i] >= '0' && ch[i] <= '9') {
                ch[i] = (char) (ch[i-1] + ch[i]-'0');
            }
        }
        String s2=new String(ch);
        System.out.println(s2);
    }
}
