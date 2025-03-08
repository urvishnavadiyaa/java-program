package String.Assignment1;

public class WordPelindrome {
    public static void main(String[] args) {
        String s="madam eye nitin";
        String str[] = s.split(" ");

        for (int i = 0; i < str.length; i++) {
            String s1 = str[i];
            char ch[] = s1.toCharArray();
            int j=0;
            int k=ch.length-1;
            while (j<k) {
                if(ch[j] != ch[k]) {
                    System.out.println("not pelindrome");
                    return;
                }
                j++;
                k--;
            }
        }
        System.out.println("pelindrome");
    }
}
