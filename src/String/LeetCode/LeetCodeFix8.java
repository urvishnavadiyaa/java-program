package String.LeetCode;

public class LeetCodeFix8 {
    public static void main(String[] args) {
        String s = "-+12";
        s = s.trim();

        if (s.length() == 0) {
            System.out.println(0);
            return;
        }

        if (s.length() == 1 && (s.charAt(0) == '-' || s.charAt(0) == '+' || s.charAt(0) == ' ')) {
            System.out.println(0);
            return;
        }

        StringBuilder sb = new StringBuilder();
        int j = 0;

        if (s.charAt(j) == '-' || (s.charAt(j) >= '1' && s.charAt(j) <= '9')) {
            sb.append(s.charAt(j));
            j++;
        } else if (s.charAt(j) == '+') {
            j++;
        } else {
            System.out.println(0);
            return;
        }

        while (j < s.length() && s.charAt(j) == '0') {
            j++;
        }

        if (j >= s.length() && s.charAt(j) < '0' || s.charAt(j) > '9') {
            System.out.println(0);
            return;
        }
        for (int i = j; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                sb.append(s.charAt(i));
            } else {
                break;
            }
        }
//        if(sb.charAt(0) == '-') {
//            System.out.println(0);
//            return;
//        }
        try {
            long num = Long.parseLong(sb.toString());
            if (num > Integer.MAX_VALUE) {
                System.out.println(Integer.MAX_VALUE);
                return;
            } else if (num < Integer.MIN_VALUE) {
                System.out.println(Integer.MIN_VALUE);
                return;
            }
            System.out.println((int) num);
        } catch (NumberFormatException e) {
            System.out.println(sb.charAt(0) == '-' ? Integer.MIN_VALUE : Integer.MAX_VALUE);
        }
    }
}
