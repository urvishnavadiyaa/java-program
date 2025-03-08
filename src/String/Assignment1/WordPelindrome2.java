package String.Assignment1;

public class WordPelindrome2 {
    public static Boolean checkPali(String s ,int st, int end) {
        while (st<end) {
            if(s.charAt(st) != s.charAt(end)) {
                return false;
            }
            st++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s="madam eye nitin";
        int j=0;
        for (int i = 0; i < s.length(); i++) {
            if (i == s.length()-1) {
                if (!checkPali(s,j,i)) {
                    System.out.println("false");
                    return;
                }
            }
            if (s.charAt(i) == ' ') {
                if (!checkPali(s,j,i-1)) {
                    System.out.println("false");
                    return;
                }
                j=i+1;
            }
        }
        System.out.println("true");
    }
}
