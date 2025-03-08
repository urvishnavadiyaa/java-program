package String.Assignment1;

public class RemoveVowel {
    public static void main(String[] args) {
        String s="hello how are you";
        String s1="";
        for (int i = 0; i < s.length(); i++) {
            int ch=s.charAt(i);
            if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i'
                    || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U') {
                continue;
            }
            s1 += s.charAt(i);
        }
        System.out.println(s1);
    }
}
