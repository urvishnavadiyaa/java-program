package String.LeetCode;

import java.util.Arrays;

public class LeetCode3 {
    public static void main(String[] args) {
        String s = "abcbb";
        int[] arr = new int[128];
        int i = 0, j = 0, maxcount = 0;

        while (j < s.length()) {
            char ch = s.charAt(j);
            arr[ch]++;

            while (arr[ch] > 1) {
                arr[s.charAt(i)]--;
                i++;
            }

            maxcount = Math.max(maxcount, j - i + 1);
            j++;
        }
        System.out.println(maxcount);
//        String s="bbbbb";
//        int arr[]=new int[128];
//        int i=0;
//        arr[s.charAt(i)]++;
//        int j=1;
//        int maxcount=0;
//        while (j<s.length()) {
//            if (arr[s.charAt(j)] == 1) {
//                int count = j-i;
//                maxcount=Math.max(maxcount,count);
//                Arrays.fill(arr,0);
//                while (s.charAt(i) != s.charAt(j)) {
//                    i++;
//                }
//                i++;
//                arr[s.charAt(i)]++;
//                j=i+1;
//                arr[s.charAt(j)]++;
//                if (arr[s.charAt(j)] != 1 && j != s.length()-1) {
//                    maxcount=Math.max(maxcount,1);
//                    Arrays.fill(arr,0);
//                    while (s.charAt(j) == s.charAt(i)) {
//                        j++;
//                    }
//                    i=j-1;
//                    j=i+1;
//                    arr[s.charAt(i)]++;
//                    arr[s.charAt(j)]++;
//                }
//                j++;
//            } else {
//                arr[s.charAt(j)]++;
//                j++;
//            }
//            if (j == s.length()-1) {
//                int count1 = j-i+1;
//                maxcount=Math.max(maxcount,count1);
//                System.out.println(maxcount);
//                return;
//            }
//        }
//        System.out.println(maxcount);
    }
}
