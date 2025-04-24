package Hashing.Assignment;
import java.util.HashSet;

public class Asg2 {
    public static void main(String[] args) {
        String s = "aabbcddbe";
        HashSet<Character> set = new HashSet<>();
        HashSet<Character> set2 = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (set.contains(ch)) {
                set.remove(ch);
                set2.add(ch);
            } else {
                set.add(ch);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (!set2.contains(s.charAt(i))) {
                System.out.println(s.charAt(i));
                break;
            }
        }
    }
}
