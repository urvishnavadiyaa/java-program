package Hashing.LeetCode;

import java.util.HashSet;

public class LeetCode202 {
    public static void main(String[] args) {
        int num = 2;
        HashSet<Integer>  set = new HashSet<>();
        while (num != 1) {
            int num1 = num;
            int newnum = 0;
            while (num1 != 0) {
                int m = num1 % 10;
                newnum += (m * m);
                num1 /= 10;
            }
            if (set.contains(newnum)) {
                System.out.println("false");
                return;
            }
            set.add(newnum);
            num = newnum;
        }
        System.out.println("true");
    }
}
