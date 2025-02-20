package Arrays.leetcode;

public class LeetCode10 {
    public static void main(String[] args) {
        int arr[]={3,5,7};
        int n=15;
        int i=0;
        int sum=0;
        while(i <= n) {
            for(int j=0;j<arr.length;j++) {
                if(i % arr[j] == 0) {
                    sum=sum+i;
                    break;
                }
            }
            i++;
        }
        System.out.println(sum);
    }
}
