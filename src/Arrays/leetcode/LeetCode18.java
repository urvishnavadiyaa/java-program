package Arrays.leetcode;

public class LeetCode18 {
    public static void main(String[] args) {
        int arr[] = {2,1,1};
        int ans=0;
        for(int i=0;i<arr.length;i++) {
            ans = ans ^ arr[i];
        }
        System.out.println(ans);
    }
}
