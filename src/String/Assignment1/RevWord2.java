package String.Assignment1;

public class RevWord2 {

    public  static String revWord(String s,int i, int j) {
        String str = "";
        for (int k = j; k >= i; k--) {
            str+=s.charAt(k);
        }
        return str;
    }
    public static void main(String[] args) {
        String s="good morning";
        String st="";
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if(i == s.length()-1) {
                st += revWord(s,j,i) +" ";
            }
            if (s.charAt(i) == ' ') {
                st += revWord(s,j,i-1)+" ";
                j=i+1;
            }
        }
        System.out.println(st);
    }
}
