package String.Assignment1;

public class RemoveDegit {
    public static void main(String[] args) {
        String s = "he110 h0w 4r3 y0u";
        int chst='0';
        int chend='9';
        String s1="";
        for (int i = 0; i <s.length() ; i++) {
            int ch=s.charAt(i);
            if (ch >= chst && ch <= chend) {
                continue;
            }
            s1+=s.charAt(i);
        }
        System.out.println(s1);
    }
}
