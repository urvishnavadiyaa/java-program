package Stack.LeetCode;

public class LeetCode2000 {
    public static void main(String[] args) {
        String s = "xyxzxe";
        String ch = "z";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch.charAt(0)) {
                int j=i;
                while (j >= 0) {
                    sb.append(s.charAt(j));
                    j--;
                }
                i++;
                while (i < s.length()) {
                    sb.append(s.charAt(i));
                    i++;
                }
            }
        }
        System.out.println(sb.toString());
    }
}
