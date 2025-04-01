package Stack.LeetCode;

import java.util.Arrays;

public class LeetCodeRendom {
    public static void main(String[] args) {
        int arr[] = {11,81,94,43,3};
        int subarr[] = new int[arr.length];
        int max = Integer.MAX_VALUE;
        int total=0;
        for (int i = 0; i < subarr.length; i++) {
            subarr[i] = subarr.length - i;
        }
        for (int i = arr.length-1; i >= 0; i--) {
            if (arr[i] < max) {
                max=arr[i];
                total += subarr[i] * arr[i];
            } else {
                total += arr[i] + (subarr[i+1] * max);
            }
        }
        System.out.println(total);
    }
}
