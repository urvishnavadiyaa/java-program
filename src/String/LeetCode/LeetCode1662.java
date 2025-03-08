package String.LeetCode;

public class LeetCode1662 {
    public static void main(String[] args) {
        String s1[]={"a", "bc"};
        String s2[]={"ab", "c"};
        String s3=String.join("",s1);
        String s4=String.join("",s2);
        System.out.println(s3.equals(s4));
    }
}
