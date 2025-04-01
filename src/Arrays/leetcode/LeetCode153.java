package Arrays.leetcode;

public class LeetCode153 {
    public static void main(String[] args) {
        int arr[] = {3,4,5,1,2};
        int i=0;
        int j=arr.length-1;
        int min=Integer.MAX_VALUE;
        while (i<=j) {
            int mid=(i+j)/2;
            if (min < arr[mid]) {
                min=Math.min(min,arr[i]);
                i=mid+1;
            } else {
                min=Math.min(min,arr[mid]);
                j=mid-1;
            }
        }
        System.out.println(min);
    }
}
