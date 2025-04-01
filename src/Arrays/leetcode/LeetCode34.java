package Arrays.leetcode;

import java.util.Arrays;

public class LeetCode34 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,6,7,8,8,8,8,8,8,9,9,10};
        int arr2[]=new int[2];
        int target=8;
        int i=0;
        int j=arr.length-1;
        while (i <= j) {
            int mid=(i+j)/2;
            if (arr[mid] == target) {
                int a=i;
                int b=mid;
                int chkmid=-1;
                while (a <= b) {
                    int mid1=(a+b)/2;
                    if (arr[mid1] == arr[mid]) {
                        arr2[0]=mid1;
                        b=mid1-1;
                    } else {
                        a=mid1+1;
                    }
                    chkmid=mid1;
                }
                if (chkmid == mid) {
                    arr2[0] = mid;
                }

                int x=mid;
                int y=j;
                int chkmid2=-1;
                while (x <= y) {
                    int mid2=(x+y)/2;
                    if (arr[mid2] == arr[mid]) {
                        arr2[1]=mid2;
                        x=mid2+1;
                    } else {
                        y=mid2-1;
                    }
                    chkmid2=mid2;
                }
                if (chkmid2 == mid) {
                    arr2[1] = mid;
                }
                break;
            } else if (arr[mid] > target) {
                j=mid-1;
            } else {
                i=mid+1;
            }
        }
        System.out.println(Arrays.toString(arr2));
    }
}
