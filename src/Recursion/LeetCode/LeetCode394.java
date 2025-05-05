package Recursion.LeetCode;

public class LeetCode394 {
    public static void main(String[] args) {
        String s = "3[a2[c]]";
        System.out.println(decodeString(s));
    }

    public static String decodeString(String s) {
        int[] index = {0};
        return decodeHelper(s, index);
    }

    private static String decodeHelper(String s, int[] i) {
        StringBuilder sb = new StringBuilder();
        int count = 0;

        while (i[0] < s.length()) {
            char c = s.charAt(i[0]);

            if (Character.isDigit(c)) {
                count = count * 10 + (c - '0');
                i[0]++;
            } else if (c == '[') {
                i[0]++;
                String decoded = decodeHelper(s, i);
                for (int j = 0; j < count; j++) {
                    sb.append(decoded);
                }
                count = 0;
            } else if (c == ']') {
                i[0]++;
                return sb.toString();
            } else {
                sb.append(c);
                i[0]++;
            }
        }
        return sb.toString();
    }
}
