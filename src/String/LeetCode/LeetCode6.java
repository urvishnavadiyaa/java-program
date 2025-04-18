package String.LeetCode;

public class LeetCode6 {
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int nr=3;
        if (nr == 1) {
            System.out.println(s);
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nr; i++) {
            for (int j = i; j < s.length(); j += (2*(nr-1))) {
                sb.append(s.charAt(j));
                if ((i > 0 && i < nr-1) && j + (2*(nr-1)) - (2*i) < s.length()) {
                    sb.append(s.charAt(j+(2*(nr-1)) - (2*i)));
                }
            }
        }
        System.out.println(sb);
    }
}
