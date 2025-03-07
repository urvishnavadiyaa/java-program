package String.Assignment1;

import java.util.Arrays;

public class UpdateChar {
    public static void main(String[] args) {
        String s="navadiyaurvish";
        char ch[]=s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if(ch[i] == 'a') {
                ch[i]='o';
            }
        }
        String str = String.valueOf(ch);
        System.out.println(str);
    }
}
