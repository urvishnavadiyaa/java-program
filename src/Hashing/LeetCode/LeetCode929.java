package Hashing.LeetCode;

import java.util.HashSet;

public class LeetCode929 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] emails = {"test.email+alex@leetcode.com", "test.email@leetcode.com"};
        int result = sol.numUniqueEmails(emails);
        System.out.println(result); // Output: 1
    }
}

class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> hashSet = new HashSet<>();

        for (String email : emails) {
            hashSet.add(getValidEmail(email));
        }

        return hashSet.size();
    }

    public String getValidEmail(String email) {
        StringBuilder sb = new StringBuilder();
        int index = email.indexOf('@');
        for (int i = 0; i < index; i++) {
            char ch = email.charAt(i);
            if (ch == '+') break;
            if (ch != '.') sb.append(ch);
        }

        sb.append(email.substring(index));
        return sb.toString();
    }
}
