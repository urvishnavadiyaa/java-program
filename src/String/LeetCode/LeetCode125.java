package String.LeetCode;

public class LeetCode125 {
    public static void main(String[] args) {
        String s= "A man, a plan, a canal: Panama";
        s=s.toLowerCase();
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            char ch = s.charAt(i);
            char ch2 = s.charAt(j);
            if (!((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9'))) {
                i++;
                continue;
            }
            if (!((ch2 >= 'a' && ch2 <= 'z') || (ch2 >= '0' && ch2 <= '9'))) {
                j--;
                continue;
            }
            if (ch != ch2) {
                System.out.println("not palindrome");
                return;
            }
            i++;
            j--;
        }
        System.out.println("pelindrome");
//        int st='a';
//        int end='z';
//        for (int i = 0; i < s.length(); i++) {
//            char ch=s.charAt(i);
//            if (ch >= st && ch <= end) {
//                str+=(char) ch;
//            }
//        }
//        int i=0;
//        int j=str.length()-1;
//        while (i<j) {
//            if(str.charAt(i) != str.charAt(j)) {
//                System.out.println("not pelindrome");
//                return;
//            }
//            i++;
//            j--;
//        }
//        System.out.println("pelindrome");
    }
}
