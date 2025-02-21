package Arrays.leetcode;

import java.util.Arrays;

public class ClosestSum {
    public static void main(String[] args) {
        int arr[]= {-1,2,1,-4};
        Arrays.sort(arr);
        int target = 1;
//        System.out.println(Arrays.toString(arr));
//        int i = 0;
//        while (i != arr.length-2 && arr[i] < target) {
//            i++;
//        }
//        int j = 0;
//        int k = arr.length-1;
//        if (target < arr[0]) {
//            i = 0;
//            j = i+1;
//            k = arr.length-1;
//        } else if (target > arr[arr.length-1]) {
//            i=arr.length-1;
//            j = i+1;
//            k = arr.length-1;
//        }
        int sum = 0;
        int diff = Integer.MAX_VALUE;
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            int j = i+1;
            int k = arr.length-1;

            while (j < k) {
                if(k == i) {
                    k--;
                    continue;
                } else if (j == i) {
                    j++;
                    continue;
                }
                sum = arr[i] + arr[j] + arr[k];
                int def = Math.abs(target - sum);
                if (def < diff) {
                    ans = sum;
                }
                diff = Math.min(diff , def);
                if (sum > target) {
                    k--;
                } else {
                    j++;
                }
            }
        }
        System.out.println(ans);
    }
}
