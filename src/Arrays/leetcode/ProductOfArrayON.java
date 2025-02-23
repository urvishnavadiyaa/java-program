package Arrays.leetcode;

import java.util.Arrays;

public class ProductOfArrayON {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4};
        int n =arr.length;
        int ans[]=new int[n];
        Arrays.fill(ans,1);
        for (int i =1; i < n; i++) {
            ans[i]=ans[i-1]*arr[i-1];
        }
        int val=1;
        for (int i = n-2; i >=0; i--) {
            val=val*arr[i+1];
            ans[i]=ans[i]*val;
        }
        System.out.println(Arrays.toString(ans));
    }
}
