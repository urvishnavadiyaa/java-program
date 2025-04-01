package Arrays.leetcode;

public class LeetCode33 {
    public static void main(String[] args) {
        int arr[]={5,1,3};
        int target=5;
        int i=0;
        int j=arr.length-1;
        while (i<=j) {
            int mid=(i+j)/2;
            if (arr[mid] == target) {
                System.out.println(mid);
                return;
            }
            if (arr[i] <= arr[mid]) {
                if (target >= arr[i] && target <= arr[mid]) {
                    j=mid-1;
                } else {
                    i=mid+1;
                }
            } else {
                if (target >= arr[mid] && target <= arr[j]) {
                    i=mid+1;
                } else {
                    j=mid-1;
                }
            }
        }
        System.out.println("not found");
    }
}
