package String.assingment2;

public class p1 {
    public static void main(String[] args) {
        String s1="urvish";
        String s2="hitend";
        char ch1[]=s1.toCharArray();
        char ch2[]=s2.toCharArray();
        for (int i = 0; i < ch1.length; i++) {
            char temp = ch1[i];
            ch1[i] = ch2[i];
            ch2[i] = temp;
        }
        System.out.println(ch1);
        System.out.println(ch2);
    }
}
