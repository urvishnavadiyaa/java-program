package Arrays.leetcode;

public class RevInteger {
    public static void main(String[] args) {
        int num = -1230000;
        String s = Integer.toString(num);
        int i=0;
        StringBuilder sb = new StringBuilder() ;
        while (s.charAt(i) != '0') {
            sb.append(s.charAt(i));
            i++;
        }
        int x = Integer.parseInt(sb.toString());
        if (x < Integer.MIN_VALUE && x > Integer.MAX_VALUE) {
            System.out.println("0");
            return;
        }
        StringBuilder sb1 = new StringBuilder();
        int m=s.length()-1;
        while (i == 0) {

        }
    }
}
