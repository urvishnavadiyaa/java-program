package String.Assignment1;

public class EqualDigtAndChar {
    public static void main(String[] args) {
        String s="urvishh6543271";
        int cntchar=0;
        int cntnum=0;
        int zero='0';
        int nine='9';
        for (int i = 0; i < s.length(); i++) {
            int ch=s.charAt(i);
            if(ch >= zero && ch <= nine) {
                cntnum++;
            } else {
                cntchar++;
            }
        }
        if(cntnum==cntchar) {
            System.out.println("same");
        } else {
            System.out.println("not same");
        }
    }
}
