package String.LeetCode;

public class LeetCodeFix8 {
    public static void main(String[] args) {
        String s="0-1";
        StringBuilder sb =new StringBuilder();
        int j=0;
        if(s.length() == 0) {
            System.out.println(0);
            return;
        }
        if(s.length() == 1 && s.charAt(0) == '-' || s.charAt(0) == '+' || s.charAt(0) == ' ') {
            System.out.println(0);
            return;
        }
        while (s.charAt(j) == ' ' || s.charAt(j) == '+') {
            j++;
        }
        if(s.charAt(j) == '-' && s.charAt(j+1) >= '0' && s.charAt(j+1) <= '9') {
            sb.append(s.charAt(j));
            j++;
        }
        while (s.charAt(j) == '0' && s.charAt(j) < '1' || s.charAt(j) > '9') {
            j++;
        }
        for (int i = j; i < s.length(); i++) {
            if (s.charAt(i) >= '1' && s.charAt(i) <= '9') {
                sb.append(s.charAt(i));
            } else if (s.charAt(i) == '0') {
                continue;
            } else  {
                break;
            }
        }
        long num = Long.parseLong(sb.toString());
        if (num > Integer.MAX_VALUE) {
            System.out.println(Integer.MAX_VALUE);
            return;
        } else if (num < Integer.MIN_VALUE) {
            System.out.println(Integer.MIN_VALUE);
            return;
        }
        if(sb.length() == 0) {
            System.out.println(0);
        } else {
            System.out.println(sb);
        }
    }
}
