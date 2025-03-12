package String.LeetCode;

public class LeetCode8 {
    public static void main(String[] args) {
        String s = "   -42";
        int num = myAtoi(s);
        System.out.println(num);
    }
    public static int myAtoi(String s) {
        StringBuilder sb =new StringBuilder();
        int j=0;
        if(s.length() == 0 || s.length() == 1 && s.charAt(0) == '-') {
            if (sb.length() == 0 ) {
                System.out.println(0);
            }
        }
        while (s.charAt(j) != '-' && s.charAt(j) < '1' || s.charAt(j) > '9') {
            if (s.charAt(j) == ' ') {
                j++;
            } else if (s.charAt(j) == '+') {
                break;
            } else if (s.charAt(j) == '0') {
                if (sb.length() == 0 ) {
                    System.out.println(0);
                }
            } else {
                if (sb.length() == 0 ) {
                    System.out.println(0);
                }
            }
        }
        if ((s.charAt(j) == '-' || s.charAt(j) == '+') && j + 1 < s.length() && s.charAt(j+1) >= '0' && s.charAt(j+1) <= '9') {
            sb.append(s.charAt(j));
        }
        int h=1;
        if (s.charAt(j) != '-' && sb.length() == 0) {
            h=0;
        }
        for (int i = j+h; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= '1' && ch <= '9') {
                sb.append(ch);
            } else if (ch == '0') {
                continue;
            } else {
                if(s.charAt(i) == '-') {
                    if (sb.length() == 0 ) {
                        System.out.println(0);
                    }
                }
                if (sb.length() == 0 ) {
                    sb.append("0");
                }
                return Integer.parseInt(sb.toString());
            }
        }
        long num = Long.parseLong(sb.toString());
        if (num > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if (num < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return (int) num;
    }
}
