package Arrays.leetcode;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int count =0;
        List<List<Integer>> listOfLists = new ArrayList<>();
        int arr[]={3,0,-2,-1,1,2};
        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length-2;i++) {
            if (i > 0 && arr[i] == arr[i - 1]) continue;
            int j=i+1;
            int k=arr.length-1;
            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if (sum == 0) {
                    listOfLists.add(Arrays.asList(arr[i], arr[j], arr[k]));
                    while (j < k && arr[j] == arr[j + 1]) j++;
                    while (j < k && arr[k] == arr[k - 1]) k--;
                    j++;
                    k--;
                } else if (sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }
//        System.out.println(count);
        System.out.println(listOfLists);
    }
}
