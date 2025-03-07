package String.Assignment1;

public class StringPalindrome {
    public static void main(String[] args) {
        String str = "naman";
        int i=0;
        int j=str.length()-1;
        while(i<j) {
            if(str.charAt(i) != str.charAt(j)) {
                System.out.println("not palindrome");
                return;
            }
            i++;
            j--;
        }
        System.out.println("palindrome");
    }
}
