package Arrays.leetcode;

public class LeetCode11 {
    public static void main(String[] args) {
        int arr[]={4,5,6,7,8,9};
        int diff=2;
        int total=0;
        int n= arr.length;
        for(int i=n-1;i>=0;i--) {
            int count=0;
            int k=arr[i];
            for(int j=n-1;j>=0;j--) {
                if(k - arr[j] == diff) {
                    count++;
                    k = arr[j];
                }
                if(count == 2) {
                    total++;
                    break;
                }
            }
        }
        System.out.println(total);
    }
}
