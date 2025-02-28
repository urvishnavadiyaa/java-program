package Arrays.leetcode;

import java.util.Arrays;

public class LeetCode349 {
    public static void main(String[] args) {
        int arr[]={4,9,5,6,2,4,5,6,8};
        int arr2[]={9,4,9,8,4};
        int idx=0;
        int ans[]=new int[Math.min(arr.length, arr2.length)];
        for (int i = 0; i < arr.length; i++) {
            int count=0;
            for (int j = 0; j < arr2.length; j++) {
                if(arr[i] == arr2[j]) {
                    if(count > 0) {
                        arr2[j]=-1;
                        continue;
                    }
                    count++;
                    ans[idx] = arr[i];
                    idx++;
                    arr2[j]=-1;
                }
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
