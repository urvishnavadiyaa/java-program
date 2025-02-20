package Arrays.leetcode;
import java.util.*;
public class LeetCode8 {
//    public static int[] calSum(int arr[],int idx) {
//
//    }
    public static void main(String[] args) {
        int num[] ={10,4,8,3};
        int n = num.length;
        int leftsum[]=new int[n];
        int rightsum[]=new int[n];
        int ans[]=new int[n];
        int i=0;
        int lsum=0;
        leftsum[i] = 0;
        while(i != n-1) {
            leftsum[i+1]=lsum+num[i];
            lsum=lsum+num[i];
            i++;
        }

        int j=n-1;
        int rsum=0;
        rightsum[j] = 0;
        while(j != 0) {
            rightsum[j-1]=rsum+num[j];
            rsum=rsum+num[j];
            j--;
        }

        for(int k=0;k<n;k++) {
            ans[k] = Math.abs(leftsum[k] - rightsum[k]);
        }


        System.out.println(Arrays.toString(leftsum));
        System.out.println(Arrays.toString(rightsum));
        System.out.println(Arrays.toString(ans));


//        calSum(num,0);
//        calSum(num,num.length);
    }
}
