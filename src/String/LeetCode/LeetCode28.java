package String.LeetCode;

public class LeetCode28 {
    public static void main(String[] args) {
        String haystack = "jadbutsad";
        String needle = "sad";
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.startsWith(needle,i)) {
                System.out.println(i);
                return;
            }
        }
        System.out.println("");
    }
}
